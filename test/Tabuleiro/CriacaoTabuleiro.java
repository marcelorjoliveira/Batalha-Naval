/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabuleiro;

import batalhanaval.Tabuleiro;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo
 */
public class CriacaoTabuleiro {
    
    private Tabuleiro tabuleiro;
    
    public CriacaoTabuleiro() {
    }
    
    @Before
    public void setUp() {
        tabuleiro = new Tabuleiro();
    }
    
    
    @Test
    public void testaTamanhoTabuleiro()
    {
        assertEquals(10, Tabuleiro.tamanho);
    }
}
