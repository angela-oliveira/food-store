package br.edu.ifpb.padroes.service.log;

public class LogDatabase implements LogHandler{
    @Override
    public void log(String message) {
        System.out.println("Save Database");
    }
}
