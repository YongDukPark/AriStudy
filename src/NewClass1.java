///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package todaylunch;
//
//import TableBean.TODAYLUNCH_LOG_BEAN;
//import com.arisystem.beans.combinetable.CombineTableRow;
//import com.arisystem.beans.combinetable.TableHeaderEvent;
//import com.arisystem.beans.datawizard.DWWhereCondition;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Vector;
//
///**
// *
// * @author dydej
// */
//public class LOGCHECK extends javax.swing.JFrame {
//    
//    ArrayList<TODAYLUNCH_LOG_BEAN> arraylist = new ArrayList<>();
//    TODAYLUNCH_LOG_BEAN Todaylunch_Log_Bean;
//    private static LOGCHECK logCheck;
//    
//    //���Ľ� �ʿ��� ģ��
//    String getHeaderName = null;
//    
//    private LOGCHECK() {
//        initComponents();
//        try {
//            dWCombineTable1.setDataSource("MariaDB_Youngria");
//            dWCombineTable1.setOrderBy("LAST_START_TIME DESC");
//            dWCombineTable1.select("http", "192.168.0.20", 8080);
//            
//            arrayListDataSet();
//        } catch (Exception e) {
//        }
//    }
//    private LOGCHECK(String SELECT_YEAR , String SELECT_MONTH , String SELECT_DAY) {
//        initComponents();
//        //where�� ����Ҷ� �ʿ��Ѿֵ�
//        Vector params = new Vector();
//        DWWhereCondition SearchSelect;
//        try {
//            System.out.println(SELECT_YEAR+"-"+SELECT_MONTH+"-"+SELECT_DAY+" 00:00:00");
//            System.out.println(SELECT_YEAR+"-"+SELECT_MONTH+"-"+SELECT_DAY+" 23:59:59");
//            System.out.println();
//            
//            
//            params.add(SELECT_YEAR+"-"+SELECT_MONTH+"-"+SELECT_DAY+" 00:00:00");
//            params.add(SELECT_YEAR+"-"+SELECT_MONTH+"-"+SELECT_DAY+" 23:59:59");
//            SearchSelect = new DWWhereCondition("LAST_START_TIME BETWEEN ? AND ?", params);
//            dWCombineTable1.setWhereContition(SearchSelect);
//            
//            dWCombineTable1.setDataSource("MariaDB_Youngria");
//            dWCombineTable1.setOrderBy("LAST_START_TIME DESC");
//            dWCombineTable1.select("http", "192.168.0.20", 8080);
//            
//            arrayListDataSet();
//        } catch (Exception e) {
//        }
//    }
//    
//    public static LOGCHECK getInstance(){
//        logCheck = new LOGCHECK();
//        if(! logCheck.isVisible()){
//            logCheck.setVisible(true);
//        }
//        return logCheck;
//    }
//    
//    public static LOGCHECK getInstance(String SELECT_YEAR , String SELECT_MONTH , String SELECT_DAY){
//        logCheck = new LOGCHECK(SELECT_YEAR, SELECT_MONTH, SELECT_DAY);
//        if(! logCheck.isVisible()){
//            logCheck.setVisible(true);
//        }
//        return logCheck;
//    }
//    
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//    private void initComponents() {
//
//        dWCombineTable1 = new com.arisystem.beans.combinetable.DWCombineTable();
//
//        dWCombineTable1.setBodyRenderer(new com.arisystem.beans.combinetable.BodyRenderer( new com.arisystem.beans.combinetable.BodyCombineCell[] {
//            new com.arisystem.beans.combinetable.BodyCombineCell("LAST_START_TIME", new com.arisystem.beans.combinetable.CellInfo(0,0), new com.arisystem.beans.combinetable.CellInfo(0,0), null, com.arisystem.beans.combinetable.CombineCell.CENTER_ALIGNMENT, com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null, null, null, "", "",null),
//            new com.arisystem.beans.combinetable.BodyCombineCell("MENU_SELECT", new com.arisystem.beans.combinetable.CellInfo(3,0), new com.arisystem.beans.combinetable.CellInfo(3,0), null, com.arisystem.beans.combinetable.CombineCell.CENTER_ALIGNMENT, com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null, null, null, "", "",null),
//            new com.arisystem.beans.combinetable.BodyCombineCell("MENU_NAME", new com.arisystem.beans.combinetable.CellInfo(2,0), new com.arisystem.beans.combinetable.CellInfo(2,0), null, com.arisystem.beans.combinetable.CombineCell.LEFT_ALIGNMENT, com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null, null, null, "", "",null),
//            new com.arisystem.beans.combinetable.BodyCombineCell("MENU_NO", new com.arisystem.beans.combinetable.CellInfo(1,0), new com.arisystem.beans.combinetable.CellInfo(1,0), null, com.arisystem.beans.combinetable.CombineCell.CENTER_ALIGNMENT, com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null, null, null, "", "",null),
//            new com.arisystem.beans.combinetable.BodyCombineCell("MENU_RESET_COUNT", new com.arisystem.beans.combinetable.CellInfo(4,0), new com.arisystem.beans.combinetable.CellInfo(4,0), null, com.arisystem.beans.combinetable.CombineCell.CENTER_ALIGNMENT, com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null, null, null, "", "com.arisystem.beans.combinetable.NumberCombineCellPainter",null),
//        }));
//        dWCombineTable1.setCellWidths(new int[] {143, 71, 374, 104, 102});
//        dWCombineTable1.setErdObjectLocations(new com.arisystem.beans.datawizard.DWErdObjectLocation[]{new com.arisystem.beans.datawizard.DWErdObjectLocation("TODAYLUNCH_LOG",30,0)});
//        dWCombineTable1.setGroupBy("");
//        dWCombineTable1.setHeaderRenderer(new com.arisystem.beans.combinetable.HeaderRenderer( new com.arisystem.beans.combinetable.HeaderCombineCell[] {
//            new com.arisystem.beans.combinetable.HeaderCombineCell("MENU_NO",new com.arisystem.beans.combinetable.CellInfo(1,0),new com.arisystem.beans.combinetable.CellInfo(1,0),"������ȣ",com.arisystem.beans.combinetable.CombineCell.CENTER_ALIGNMENT,com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null,null,null,"",null),
//            new com.arisystem.beans.combinetable.HeaderCombineCell("MENU_NAME",new com.arisystem.beans.combinetable.CellInfo(2,0),new com.arisystem.beans.combinetable.CellInfo(2,0),"�޴���",com.arisystem.beans.combinetable.CombineCell.CENTER_ALIGNMENT,com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null,null,null,"",null),
//            new com.arisystem.beans.combinetable.HeaderCombineCell("MENU_SELECT",new com.arisystem.beans.combinetable.CellInfo(3,0),new com.arisystem.beans.combinetable.CellInfo(3,0),"���ÿ���",com.arisystem.beans.combinetable.CombineCell.CENTER_ALIGNMENT,com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null,null,null,"",null),
//            new com.arisystem.beans.combinetable.HeaderCombineCell("MENU_RESET_COUNT",new com.arisystem.beans.combinetable.CellInfo(4,0),new com.arisystem.beans.combinetable.CellInfo(4,0),"���� RESET Ƚ��",com.arisystem.beans.combinetable.CombineCell.CENTER_ALIGNMENT,com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null,null,null,"",null),
//            new com.arisystem.beans.combinetable.HeaderCombineCell("LAST_START_TIME",new com.arisystem.beans.combinetable.CellInfo(0,0),new com.arisystem.beans.combinetable.CellInfo(0,0),"�α׻����ð�",com.arisystem.beans.combinetable.CombineCell.CENTER_ALIGNMENT,com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null,null,null,"",null),
//        }));
//        dWCombineTable1.setJoinConditions(new com.arisystem.beans.datawizard.DWJoinCondition[] {
//            new com.arisystem.beans.datawizard.DWNotJoinCondition(new com.arisystem.beans.datawizard.DWTable("null","TODAYLUNCH_LOG","TODAYLUNCH_LOG"))});
//    dWCombineTable1.setMainTable(new com.arisystem.beans.datawizard.DWTable("null","TODAYLUNCH_LOG","TODAYLUNCH_LOG"));
//    dWCombineTable1.setOrderBy("");
//    dWCombineTable1.setSelectFieldObjects(new com.arisystem.beans.datawizard.DWAliasFieldObject[]{
//        new com.arisystem.beans.datawizard.DWAliasFieldObject(new com.arisystem.beans.datawizard.DWTable("null","TODAYLUNCH_LOG","TODAYLUNCH_LOG"),"LAST_START_TIME",com.arisystem.beans.datawizard.DWFieldObject.DATA_FIELD_LARGE_NORMAL,"LAST_START_TIME") ,
//        new com.arisystem.beans.datawizard.DWAliasFieldObject(new com.arisystem.beans.datawizard.DWTable("null","TODAYLUNCH_LOG","TODAYLUNCH_LOG"),"MENU_SELECT",com.arisystem.beans.datawizard.DWFieldObject.DATA_FIELD_LARGE_NORMAL,"MENU_SELECT") ,
//        new com.arisystem.beans.datawizard.DWAliasFieldObject(new com.arisystem.beans.datawizard.DWTable("null","TODAYLUNCH_LOG","TODAYLUNCH_LOG"),"MENU_NAME",com.arisystem.beans.datawizard.DWFieldObject.DATA_FIELD_LARGE_NORMAL,"MENU_NAME") ,
//        new com.arisystem.beans.datawizard.DWAliasFieldObject(new com.arisystem.beans.datawizard.DWTable("null","TODAYLUNCH_LOG","TODAYLUNCH_LOG"),"MENU_NO",com.arisystem.beans.datawizard.DWFieldObject.DATA_FIELD_LARGE_NORMAL,"MENU_NO") ,
//        new com.arisystem.beans.datawizard.DWAliasFieldObject(new com.arisystem.beans.datawizard.DWTable("null","TODAYLUNCH_LOG","TODAYLUNCH_LOG"),"MENU_RESET_COUNT",com.arisystem.beans.datawizard.DWFieldObject.DATA_FIELD_LARGE_NORMAL,"MENU_RESET_COUNT") });
//dWCombineTable1.setWhereContition(new com.arisystem.beans.datawizard.DWWhereCondition(""));
//dWCombineTable1.addTableHeaderListener(new com.arisystem.beans.combinetable.TableHeaderListener() {
//    public void combineTableHeaderMouseClick(com.arisystem.beans.combinetable.TableHeaderEvent evt) {
//        dWCombineTable1CombineTableHeaderMouseClick(evt);
//    }
//    public void combineTableHeaderMouseEnter(com.arisystem.beans.combinetable.TableHeaderEvent evt) {
//    }
//    public void combineTableHeaderMouseExit(com.arisystem.beans.combinetable.TableHeaderEvent evt) {
//    }
//    public void combineTableHeaderBeforePaintCell(com.arisystem.beans.combinetable.TableHeaderEvent evt) {
//    }
//    });
//
//    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//    getContentPane().setLayout(layout);
//    layout.setHorizontalGroup(
//        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//        .addGroup(layout.createSequentialGroup()
//            .addContainerGap()
//            .addComponent(dWCombineTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
//            .addContainerGap())
//    );
//    layout.setVerticalGroup(
//        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//        .addGroup(layout.createSequentialGroup()
//            .addContainerGap()
//            .addComponent(dWCombineTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
//            .addContainerGap())
//    );
//
//    pack();
//    }// </editor-fold>                        
//
//    
//    //�ָ��� ����
//    //���� type1 ���� type2�� ��ü�� ����
//    //���Ľø��� select�� ������ �κ��� �ذ��ϱ� ���� arraylist�� �����ϴ� ����� ä���ߴ�.
//    //���� type3�� ����� �ȴٸ� ���� select�� ����ð��� ���� �Һ��ؼ� �� Į������ ���ĵ� �����͸� �������� arraylist�� ������
//    //���Ľ�Ű�� �ð��� ���ְ� �ٷ� list�� �ҷ����� ����� ����Ű���.
//    private void dWCombineTable1CombineTableHeaderMouseClick(com.arisystem.beans.combinetable.TableHeaderEvent evt) {                                                             
//        //sortType1(evt);
//        sortType2(evt);
//        
//    }                                                            
//    public void arrayListDataSet(){
//        for(int i = 0 ; i < dWCombineTable1.getRowCount() ; i++){
//            Todaylunch_Log_Bean = new TODAYLUNCH_LOG_BEAN();
//            Todaylunch_Log_Bean.setMENU_NO((String)dWCombineTable1.getRow(i).getValue("MENU_NO"));
//            Todaylunch_Log_Bean.setMENU_NAME((String)dWCombineTable1.getRow(i).getValue("MENU_NAME"));
//            Todaylunch_Log_Bean.setMENU_SELECT((String)dWCombineTable1.getRow(i).getValue("MENU_SELECT"));
//            Todaylunch_Log_Bean.setLAST_START_TIME(String.valueOf(dWCombineTable1.getRow(i).getValue("LAST_START_TIME")));
//            Todaylunch_Log_Bean.setMENU_RESET_COUNT(String.valueOf(dWCombineTable1.getRow(i).getValue("MENU_RESET_COUNT")));
//            arraylist.add(Todaylunch_Log_Bean);
//        }
//    }
//    public void sortType1(TableHeaderEvent evt){
//        //System.out.println(evt.getClickCount()); // Ŭ���� Ƚ�� �ҷ���
//        //System.out.println(evt.getCombineCellName()); // �� LAST_START_TIME �䷱ value�� �ҷ���
//        //System.out.println(dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName()); // �ؽ�Ʈ �̸� ������ �ҷ���
//        if(evt.getClickCount() > 0){
//            try {
//                if(evt.getCombineCellName().equals("LAST_START_TIME")){ //�α׻����ð�
//                    dWCombineTable1.setHeaderTitleValue("MENU_NO", "������ȣ");
//                    dWCombineTable1.setHeaderTitleValue("MENU_NAME", "�޴���");
//                    dWCombineTable1.setHeaderTitleValue("MENU_SELECT", "���ÿ���");
//                    dWCombineTable1.setHeaderTitleValue("MENU_RESET_COUNT", "���� RESET Ƚ��");
//                    if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("�α׻����ð�")){
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("LAST_START_TIME DESC");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "�α׻����ð���");
//                    } else if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("�α׻����ð���")) {
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("LAST_START_TIME ASC");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "�α׻����ð���");
//                    } else if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("�α׻����ð���")) {
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("LAST_START_TIME");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "�α׻����ð�");
//                    }
//                } else if (evt.getCombineCellName().equals("MENU_NO")){ //������ȣ
//                    dWCombineTable1.setHeaderTitleValue("LAST_START_TIME", "�α׻����ð�");
//                    dWCombineTable1.setHeaderTitleValue("MENU_NAME", "�޴���");
//                    dWCombineTable1.setHeaderTitleValue("MENU_SELECT", "���ÿ���");
//                    dWCombineTable1.setHeaderTitleValue("MENU_RESET_COUNT", "���� RESET Ƚ��");
//                    if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("������ȣ")){
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("MENU_NO DESC");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "������ȣ��");
//                    } else if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("������ȣ��")) {
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("MENU_NO ASC");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "������ȣ��");
//                    } else if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("������ȣ��")) {
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("MENU_NO");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "������ȣ");
//                    }
//                } else if (evt.getCombineCellName().equals("MENU_NAME")){ //��ǰ��
//                    dWCombineTable1.setHeaderTitleValue("LAST_START_TIME", "�α׻����ð�");
//                    dWCombineTable1.setHeaderTitleValue("MENU_NO", "������ȣ");
//                    dWCombineTable1.setHeaderTitleValue("MENU_SELECT", "���ÿ���");
//                    dWCombineTable1.setHeaderTitleValue("MENU_RESET_COUNT", "���� RESET Ƚ��");
//                    if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("�޴���")){
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("MENU_NAME DESC");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "�޴����");
//                    } else if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("�޴����")) {
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("MENU_NAME ASC");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "�޴����");
//                    } else if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("�޴����")) {
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("MENU_NAME");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "�޴���");
//                    }
//                } else if (evt.getCombineCellName().equals("MENU_SELECT")){ //���� ����
//                    dWCombineTable1.setHeaderTitleValue("LAST_START_TIME", "�α׻����ð�");
//                    dWCombineTable1.setHeaderTitleValue("MENU_NO", "������ȣ");
//                    dWCombineTable1.setHeaderTitleValue("MENU_NAME", "�޴���");
//                    dWCombineTable1.setHeaderTitleValue("MENU_RESET_COUNT", "���� RESET Ƚ��");
//                    if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("���ÿ���")){
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("MENU_SELECT DESC");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "���ÿ��Ρ�");
//                    } else if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("���ÿ��Ρ�")) {
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("MENU_SELECT ASC");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "���ÿ��Ρ�");
//                    } else if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("���ÿ��Ρ�")) {
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("MENU_SELECT");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "���ÿ���");
//                    }
//                } else if (evt.getCombineCellName().equals("MENU_RESET_COUNT")){ //reset Ƚ��
//                    dWCombineTable1.setHeaderTitleValue("LAST_START_TIME", "�α׻����ð�");
//                    dWCombineTable1.setHeaderTitleValue("MENU_NO", "������ȣ");
//                    dWCombineTable1.setHeaderTitleValue("MENU_NAME", "�޴���");
//                    dWCombineTable1.setHeaderTitleValue("MENU_SELECT", "���ÿ���");
//                    if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("���� RESET Ƚ��")){
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("MENU_RESET_COUNT DESC");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "���� RESET Ƚ����");
//                    } else if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("���� RESET Ƚ����")) {
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("MENU_RESET_COUNT ASC");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "���� RESET Ƚ����");
//                    } else if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("���� RESET Ƚ����")) {
//                        dWCombineTable1.setDataSource("MariaDB_Youngria");
//                        dWCombineTable1.setOrderBy("MENU_RESET_COUNT");
//                        dWCombineTable1.select("http", "192.168.0.20", 8080);
//                        dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "���� RESET Ƚ��");
//                    }
//                }
//            } catch (Exception e) {
//            }
//        }
//    }
//    
//    //���Ľ�Ű�� �ڵ� �̹�� ä���� ������ select�� ������ ������ �ʾƵ� �ȴ�.
//    public void sortType2(TableHeaderEvent evt){
//        //�о���������� �ٽ� �����ϱ� ��
//        dWCombineTable1.removeAllRows();
//        //���� �������� ������ ģ��
//        getHeaderName = evt.getCombineCellName();
//        
//        //���Ľ�Ű�� �ڵ�
//        Collections.sort(arraylist, new Comparator<TODAYLUNCH_LOG_BEAN>() {
//            public int compare(TODAYLUNCH_LOG_BEAN o1, TODAYLUNCH_LOG_BEAN o2) {
//                if(getHeaderName.equals("LAST_START_TIME")){ //�α� �����ð�
//                    if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("�α׻����ð�")){
//                        return o1.getLAST_START_TIME().compareTo(o2.getLAST_START_TIME());
//                    } else {
//                        return o2.getLAST_START_TIME().compareTo(o1.getLAST_START_TIME());
//                    }
//                } else if(getHeaderName.equals("MENU_NO")) { //������ȣ
//                    if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("������ȣ")){
//                        return Integer.parseInt(o1.getMENU_NO()) - Integer.parseInt(o2.getMENU_NO());
//                    } else {
//                        return Integer.parseInt(o2.getMENU_NO()) - Integer.parseInt(o1.getMENU_NO());
//                    }
//                } else if(getHeaderName.equals("MENU_NAME")) { //�޴���
//                    if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("�޴���")){
//                        return o1.getMENU_NAME().compareTo(o2.getMENU_NAME());
//                    } else {
//                        return o2.getMENU_NAME().compareTo(o1.getMENU_NAME());
//                    }
//                } else if(getHeaderName.equals("MENU_SELECT")) { //Y or N ����
//                    if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("���ÿ���")){
//                        return o1.getMENU_SELECT().compareTo(o2.getMENU_SELECT());
//                    } else {
//                        return o2.getMENU_SELECT().compareTo(o1.getMENU_SELECT());
//                    }
//                } else if(getHeaderName.equals("MENU_RESET_COUNT")) {
//                    if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("���� RESET Ƚ��")){
//                        return Integer.parseInt(o1.getMENU_RESET_COUNT()) - Integer.parseInt(o2.getMENU_RESET_COUNT());
//                    } else {
//                        return Integer.parseInt(o2.getMENU_RESET_COUNT()) - Integer.parseInt(o1.getMENU_RESET_COUNT());
//                    }
//                } else {
//                    return o1.getLAST_START_TIME().compareTo(o2.getLAST_START_TIME());
//                }
//            }
//        });
//        
//        //�̸� �������ִ� �κ�
//        if(getHeaderName.equals("LAST_START_TIME")){ //�α� �����ð�
//            dWCombineTable1.setHeaderTitleValue("MENU_NO", "������ȣ");
//            dWCombineTable1.setHeaderTitleValue("MENU_NAME", "�޴���");
//            dWCombineTable1.setHeaderTitleValue("MENU_SELECT", "���ÿ���");
//            dWCombineTable1.setHeaderTitleValue("MENU_RESET_COUNT", "���� RESET Ƚ��");
//            if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("�α׻����ð�")){
//                dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "�α׻����ð���");
//            } else {
//                dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "�α׻����ð�");
//            }
//        } else if(getHeaderName.equals("MENU_NO")) { //������ȣ
//            dWCombineTable1.setHeaderTitleValue("LAST_START_TIME", "�α׻����ð�");
//            dWCombineTable1.setHeaderTitleValue("MENU_NAME", "�޴���");
//            dWCombineTable1.setHeaderTitleValue("MENU_SELECT", "���ÿ���");
//            dWCombineTable1.setHeaderTitleValue("MENU_RESET_COUNT", "���� RESET Ƚ��");
//            if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("������ȣ")){
//                dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "������ȣ��");
//            } else {
//                dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "������ȣ");
//            }
//        } else if(getHeaderName.equals("MENU_NAME")) { //�޴���
//            dWCombineTable1.setHeaderTitleValue("LAST_START_TIME", "�α׻����ð�");
//            dWCombineTable1.setHeaderTitleValue("MENU_NO", "������ȣ");
//            dWCombineTable1.setHeaderTitleValue("MENU_SELECT", "���ÿ���");
//            dWCombineTable1.setHeaderTitleValue("MENU_RESET_COUNT", "���� RESET Ƚ��");
//            if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("�޴���")){
//                dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "�޴����");
//            } else {
//                dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "�޴���");
//            }
//        } else if(getHeaderName.equals("MENU_SELECT")) { //Y or N ����
//            dWCombineTable1.setHeaderTitleValue("LAST_START_TIME", "�α׻����ð�");
//            dWCombineTable1.setHeaderTitleValue("MENU_NO", "������ȣ");
//            dWCombineTable1.setHeaderTitleValue("MENU_NAME", "�޴���");
//            dWCombineTable1.setHeaderTitleValue("MENU_RESET_COUNT", "���� RESET Ƚ��");
//            if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("���ÿ���")){
//                dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "���ÿ��Ρ�");
//            } else {
//                dWCombineTable1.setHeaderTitleValue(evt.getCombineCellName(), "���ÿ���");
//            }
//        } else if(getHeaderName.equals("MENU_RESET_COUNT")) {
//            dWCombineTable1.setHeaderTitleValue("LAST_START_TIME", "�α׻����ð�");
//            dWCombineTable1.setHeaderTitleValue("MENU_NO", "������ȣ");
//            dWCombineTable1.setHeaderTitleValue("MENU_NAME", "�޴���");
//            dWCombineTable1.setHeaderTitleValue("MENU_SELECT", "���ÿ���");
//            if(dWCombineTable1.getHeaderTitleValue(evt.getCombineCellName()).equals("���� RESET Ƚ��")){
//                dWCombineTable1.setHeaderTitleValue("MENU_RESET_COUNT", "���� RESET Ƚ����");
//            } else {
//                dWCombineTable1.setHeaderTitleValue("MENU_RESET_COUNT", "���� RESET Ƚ��");
//            }
//        }
//        
//        //������ ����
//        for(int i = 0 ; i < arraylist.size() ; i++){
//            dWCombineTable1.addRow();
//            dWCombineTable1.setValue(i, "MENU_NO", arraylist.get(i).getMENU_NO());
//            dWCombineTable1.setValue(i, "MENU_NAME", arraylist.get(i).getMENU_NAME());
//            dWCombineTable1.setValue(i, "MENU_SELECT", arraylist.get(i).getMENU_SELECT());
//            dWCombineTable1.setValue(i, "MENU_RESET_COUNT", arraylist.get(i).getMENU_RESET_COUNT());
//            dWCombineTable1.setValue(i, "LAST_START_TIME", arraylist.get(i).getLAST_START_TIME());
//        }
//    }
//    
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LOGCHECK().setVisible(true);
//            }
//        });
//    }
//
//    // Variables declaration - do not modify                     
//    private com.arisystem.beans.combinetable.DWCombineTable dWCombineTable1;
//    // End of variables declaration                   
//
//    
//}
//
