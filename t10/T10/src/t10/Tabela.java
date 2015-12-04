package t10;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * @brief Classe que representa um banco de dados em memória para uma revenda de carros.
 * @author alberto
 */
public class Tabela extends AbstractTableModel  {
   
   // Lista de veículos do banco de dados.
   private ArrayList <Posto> posto;
   
   // Array com os nomes das colunas da tabela.
   private static final String[] nomeColunas = {"CNPJ", "Razão Social", "Nome Fantasia", "Bandeira", "Rua", "Numero", "Bairro", "CEP"};
   
   /**
    * Construtor padrão.
    */
   public Tabela() {
      posto = new ArrayList <> ();
   }

   /**
    * @return Contagem de linhas do model.
    */
   @Override
   public int getRowCount() {
      return posto.size();
   }
   
   /**
    * @return Contagem das colunas do model;
    */
   @Override
   public int getColumnCount() {
      return nomeColunas.length;
   }
   
   /**
    * Operação de CRUD: Adicionar veículo.
    * @param v {@link Veiculo} Novo veículo a ser adicionado.
    */
   public void add(Posto p) {
       posto.add(p);

      fireTableRowsInserted(posto.size()-1, posto.size()-1); // Mantenha essa linha no *final* do método!
   }
   
   /**
    * Operação de CRUD: Recupera um veículo do banco de dados para edição.
    * @param rowSelected Linha da tabela visual que foi selecionada.
    * @return {@link Veiculo} assocido a tal linha da tabela visual.
    */
   public Posto select(int rowSelected) {
      return posto.get(rowSelected);
   }
   
   /**
    * Operação de CRUD: Remoção de um veículo do banco de dados.
    * @param rowSelected Linha da tabela visual que contém o veículo a ser apagado.
    */
   public void remove(int rowSelected) {
      posto.remove(rowSelected);
      
      fireTableRowsDeleted(rowSelected, rowSelected); // Mantenha essa linha no *final* do método!
   }
   
   
   
   
   
   /**
    * Operação de CRUD: Atualização de uma entrada do banco de dados.
    * @param rowSelected Linha da tabela visual que contém a entrada a ser atualizada.
    * @param v {@link Veiculo} com os dados atualizados.
    */
   public void update(int rowSelected, Posto p) {
      posto.set(rowSelected, p);
      fireTableRowsUpdated(rowSelected, rowSelected);
   }  

   /**
    * Pega o nome de uma coluna.
    * @param columnIndex Índice da coluna desejada.
    * @return Nome da coluna.
    */
   @Override
   public String getColumnName(int columnIndex) {
      return nomeColunas[columnIndex];
   }
   
   /**
    * Método usado para preencher a tabela visual.
    * @param rowIndex Linha selecionada.
    * @param columnIndex Coluna selecionada.
    * @return Valor do {@link Veiculo} da referida linha, atributo referente a coluna selecionada.
    */
   @Override
   public Object getValueAt(int rowIndex, int columnIndex) {
      Posto p = posto.get(rowIndex);
      switch (columnIndex) {
         case 0: return p.getCnpj();
         case 1: return p.getRazao_social();
         case 2: return p.getNome_fantasia();
         case 3: return p.getBandeira();
         case 4: return p.getRua();
         case 5: return p.getNumero();
         case 6: return p.getBairro();
         case 7: return p.getCep();
      }
      return null;
   }
   
}
