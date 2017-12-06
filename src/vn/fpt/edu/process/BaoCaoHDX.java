/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.process;

import java.io.File;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import vn.fpt.edu.connect.Connect;

/**
 *
 * @author Admin
 */
public class BaoCaoHDX {

    PreparedStatement stm = null;
    ResultSet rs = null;
    Connect cn = new Connect();
    Connection cnn = cn.getConnect();

    public BaoCaoHDX(int mahdx) throws IOException, WriteException {
         WritableWorkbook workbook = Workbook.createWorkbook(new File("D:/hoadonxuat/"+mahdx+".xls"));
        WritableSheet sheet = workbook.createSheet("My Sheet", 0);
        // Create cell font and format
        WritableFont cellFont = new WritableFont(WritableFont.TIMES, 12);
        

        WritableCellFormat cellFormat = new WritableCellFormat(cellFont);
       
        cellFormat.setBorder(Border.ALL, BorderLineStyle.THIN);
        int co1=0;
         int widthInCharsss = 20;
        sheet.setColumnView(co1, widthInCharsss);
        sheet.addCell(new Label(co1, 0, "Siêu thị Group 5", cellFormat));
        
//tiêu đề
 int coll = 2;
        int widthInCharss = 16;
        sheet.setColumnView(coll, widthInCharss);
        sheet.addCell(new Label(coll, 0, "mã hóa đơn", cellFormat));
        
         int coll1 = 3;
        int widthInCharss1 = 16;
        sheet.setColumnView(coll1, widthInCharss);
        sheet.addCell(new Label(coll1, 0, "giá tiền", cellFormat));
        
         int coll2 = 4;
        int widthInCharss2 = 16;
        sheet.setColumnView(coll2, widthInCharss2);
        sheet.addCell(new Label(coll2, 0, "số lượng", cellFormat));
        
         int coll3 = 5;
        int widthInCharss3 = 16;
        sheet.setColumnView(coll3, widthInCharss3);
        sheet.addCell(new Label(coll3, 0, "mã hàng hóa", cellFormat));
        
         int coll4 = 6;
        int widthInCharss4 = 16;
        sheet.setColumnView(coll4, widthInCharss4);
        sheet.addCell(new Label(coll4, 0, "thành tiền", cellFormat));

        try {
            String sql = "select * from chitiethdx where mahdx=?";
            stm = cnn.prepareStatement(sql);
            stm.setString(1, mahdx+"");
            rs = stm.executeQuery();
            while (rs.next()) {
                  int col = 2;
        int widthInChars = 3;
        sheet.setColumnView(col, widthInChars);
        sheet.addCell(new Label(col, 1, rs.getString(1), cellFormat));

        col = 3;
        widthInChars = 4;
        sheet.setColumnView(col, widthInChars);
        sheet.addCell(new Label(col, 1, rs.getString(2), cellFormat));

        col = 4;
        widthInChars = 16;
        sheet.setColumnView(col, widthInChars);
        sheet.addCell(new Label(col, 1, rs.getString(3), cellFormat));
        col = 5;
        widthInChars = 16;
        sheet.setColumnView(col, widthInChars);
        sheet.addCell(new Label(col, 1, rs.getString(4), cellFormat));
        col = 6;
        widthInChars = 16;
        sheet.setColumnView(col, widthInChars);
        sheet.addCell(new Label(col, 1, rs.getString(5), cellFormat));
                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
        }
       
        //Set cell width in CHARS
      

        //Writes out the data held in this workbook in Excel format
        workbook.write();

        //Close and free allocated memory 
        workbook.close();

    }

}
