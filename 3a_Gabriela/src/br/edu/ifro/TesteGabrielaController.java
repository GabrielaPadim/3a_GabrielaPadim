/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author 01453074252
 */
public class TesteGabrielaController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField txtNumero1;
    @FXML
    private TextField txtNumero2;
    @FXML
    private TextField txtResultado;
    @FXML
    private Label lblNumero1;
    @FXML
    private Label lblNumero2;
    @FXML
    private Label lblResultado;
    @FXML
    private Button btnSoma;
    @FXML
    private Button btnSubtracao;
    @FXML
    private Button btnDivisao;
    @FXML
    private Button btnMultiplicacao;

    

    
    @FXML
    private void soma(ActionEvent event) {
Double num1= Double.parseDouble(txtNumero1.getText());
Double num2= Double.parseDouble(txtNumero2.getText());
Double resultado= num1+num2;
txtResultado.setText(resultado.toString());
    }
    @FXML
    private void subtracao(ActionEvent event) {
Double num1= Double.parseDouble(txtNumero1.getText());
Double num2= Double.parseDouble(txtNumero2.getText());
Double resultado= num1-num2;
txtResultado.setText(resultado.toString());
        }
    @FXML
    private void divisao(ActionEvent event) {
Double num1= Double.parseDouble(txtNumero1.getText());
Double num2= Double.parseDouble(txtNumero2.getText());
Double resultado= num1/num2;
txtResultado.setText(resultado.toString());
        }
    @FXML
    private void multiplicacao(ActionEvent event) {
Double num1= Double.parseDouble(txtNumero1.getText());
Double num2= Double.parseDouble(txtNumero2.getText());
Double resultado= num1*num2;
txtResultado.setText(resultado.toString());
        }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void abrirCadastroAluno(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),900,682);
            Stage stage = new Stage();
    stage.setTitle("Cadastrar Alunos");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){

}
    }


    @FXML
    private void fecharProjeto(ActionEvent event) {
    }
    
    }
