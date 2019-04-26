/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer2peer;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author raquel
 */
public class ModeloTablaUsuarios extends AbstractTableModel{
    ArrayList<String> usuarios;

    
    public ModeloTablaUsuarios(){
        usuarios = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return this.usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return usuarios.get(rowIndex);
    }
      @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }
      @Override
    public String getColumnName(int col) {
        return "nombre";
    }

    @Override
    public Class getColumnClass(int col) {
        return java.lang.String.class;
    }
    
    public void setFilas(ArrayList<String> t) {
        this.usuarios = t;
        fireTableDataChanged();
    }
    
    public String getFila(int fila){
        return usuarios.get(fila);
    }
    
    public void addFila(String it){
        this.usuarios.add(it);
        fireTableDataChanged();
    }
    
    public void removeFila(int index){
        this.usuarios.remove(index);
        fireTableDataChanged();
    }

    
}
