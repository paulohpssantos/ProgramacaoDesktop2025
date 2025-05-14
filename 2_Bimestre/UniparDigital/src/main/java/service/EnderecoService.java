/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.google.gson.Gson;
import dto.EnderecoDTO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author paulodossantos
 */
public class EnderecoService {
    
    private static String URLWEBSERVICE = "http://viacep.com.br/ws/";
    private static int SUCESSO = 200;
    
    public static EnderecoDTO buscaEndereco(String cep) throws Exception{
        String urlChamada = URLWEBSERVICE + cep + "/json";
        
        try{
            URL url = new URL(urlChamada);
            HttpURLConnection conexao = 
                    (HttpURLConnection) url.openConnection();
            
            if(conexao.getResponseCode() != SUCESSO){
                throw new RuntimeException(
                        "Erro ao conectar: "
                                +conexao.getResponseMessage());
            }
            
            //Pegando a resposta da API
            BufferedReader resposta = 
                    new BufferedReader(
                            new InputStreamReader(
                                    conexao.getInputStream()));
            
            String json = converteJsonString(resposta);
            Gson gson = new Gson();
            EnderecoDTO dto = gson.fromJson(json, EnderecoDTO.class);
            
            return dto;
            
        }catch(Exception ex){
            throw new Exception("Erro ao retornar endereço: "+ex);
        }
    }
    
    public static String converteJsonString(
            BufferedReader bufferReader) throws IOException{
        
        String resposta = "";
        String jsonString = "";
        
        while((resposta = bufferReader.readLine()) != null){
            jsonString += resposta;
        }
        return jsonString;
    }
    
}
