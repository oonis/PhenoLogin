/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phenologin.test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import phenologin.PhenoLoginUI;

/**
 *
 * @author Oliver
 */
public class TestUI extends JFrame{
    public static void main( String[] args ) throws Exception{
        TestUI t = new TestUI();
        t.setSize( 500, 500 );
        t.setLocationRelativeTo( null );
        t.setVisible( true );
    }
    
    private TestUI(){
        JPanel jp = new JPanel();
        jp.add( new JButton( "Test" ){{
            addActionListener( e -> {
                new PhenoLoginUI( TestUI.this, true ).setVisible( true );
            });
        }});
        setContentPane( jp );
    }
}