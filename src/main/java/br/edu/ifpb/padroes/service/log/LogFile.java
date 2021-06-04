package br.edu.ifpb.padroes.service.log;

public class LogFile implements LogHandler {
    @Override
    public void log(String message) {
        System.out.println("Save File");
    }
}
