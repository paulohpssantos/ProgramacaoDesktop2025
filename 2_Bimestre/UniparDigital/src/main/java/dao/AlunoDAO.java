/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Aluno;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author paulodossantos
 */
public class AlunoDAO extends GenericDAO<Aluno>{

    @Override
    protected Aluno construirObjeto(ResultSet rs) {
        Aluno aluno = null;
        
        try {
            
            aluno = new Aluno();
            aluno.setRaAluno(rs.getInt("RA_ALUNO"));
            aluno.setNomeAluno(rs.getString("NOME_ALUNO"));
            aluno.setDtNascAluno(rs.getString("DT_NASC_ALUNO"));
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return aluno;
       
    }

    @Override
    public boolean salvar(Aluno aluno) {
        
        String sql = "INSERT INTO public.\"Aluno\"(" +
                    "\"RA_ALUNO\", \"NOME_ALUNO\", \"DT_NASC_ALUNO\")" +
                    "VALUES (?, ?, ?);";
            
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, aluno.getRaAluno());
            ps.setString(2, aluno.getNomeAluno());
            ps.setString(3, aluno.getDtNascAluno());
            ps.executeUpdate();
            ps.close();
            
            return true;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
                
    }

    @Override
    public boolean atualizar(Aluno aluno) {
        String sql = "UPDATE public.\"Aluno\" SET "
                    + "\"NOME_ALUNO\"=?, \"DT_NASC_ALUNO\"=? "
                    + "WHERE \"RA_ALUNO\" = ?";
            
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getNomeAluno());
            ps.setString(2, aluno.getDtNascAluno());
            ps.setInt(3, aluno.getRaAluno());
            ps.executeUpdate();
            ps.close();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    public void gerarRelatorio() {
        
        
        try {
            
            //Responsável por carregar o relatório
            String relatorioPath = "relatorio/RelatorioAlunos.jasper";
            JasperPrint printer = JasperFillManager.fillReport(relatorioPath, null, conn);
            
            //Exibir o relatório
            JasperViewer view = new JasperViewer(printer, false);
            view.setVisible(true);
            
            
        } catch (JRException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
