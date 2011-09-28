/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

import java.util.ArrayList;

/**
 *
 * @author marcelo
 */
public class BarcoDeDoisCanos {
    
    private final int DIREITA = 1;
    private final int BAIXO = 2;
    private final int ESQUERDA = 3;
    private final int CIMA = 4;
    
    public ArrayList<Ponto> pontos = new ArrayList<Ponto>();
    
    public BarcoDeDoisCanos(int XOrigem, int YOrigem, int direcao)
    {
        criaPontoInicial(XOrigem,YOrigem);
        criaPontoBaseadoEmDirecao(direcao);
    }

    private void criaPontoInicial(int XOrigem, int YOrigem)
    {
        Ponto ponto = new Ponto();
        ponto.X = XOrigem;
        ponto.Y = YOrigem;
        pontos.add(ponto);
    }
    
    private void criaPontoBaseadoEmDirecao(int direcao)
    {
        switch(direcao)
        {
            case DIREITA:
                criaPontosaDireita();
                break;
            case BAIXO:
                criaPontosAbaixo();
                break;
            case ESQUERDA:
                criaPontosaEsquerda();
                break;
            case CIMA:
                criaPontosAcima();
                break;
        }
    }
    
    private void criaPontosaDireita() {
        Ponto ponto2 = new Ponto();
        ponto2.X = pontos.get(0).X + 1;
        ponto2.Y = pontos.get(0).Y;
        pontos.add(ponto2);
    }

    private void criaPontosAbaixo() {
        Ponto ponto2 = new Ponto();
        ponto2.X = pontos.get(0).X;
        ponto2.Y = pontos.get(0).Y + 1;
        pontos.add(ponto2);
    }

    private void criaPontosaEsquerda() {
        Ponto ponto2 = new Ponto();
        ponto2.X = pontos.get(0).X - 1;
        ponto2.Y = pontos.get(0).Y;
        pontos.add(ponto2);
    }

    private void criaPontosAcima() {
        Ponto ponto2 = new Ponto();
        ponto2.X = pontos.get(0).X;
        ponto2.Y = pontos.get(0).Y - 1;
        pontos.add(ponto2);
    }
}
