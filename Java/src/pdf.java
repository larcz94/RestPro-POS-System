/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
/**
 *
 * @author Asanka
 */
public class pdf {
     public static void main(String arg[])throws Exception
      {
       Document document=new Document();
       PdfWriter.getInstance(document,new FileOutputStream("hello11.pdf"));
      document.open();  
      document.add(new Paragraph("iText is a PDF library that allows you to CREATE, ADAPT, INSPECT and MAINTAIN documents in the Portable Document Format (PDF): - Generate documents and reports based on data from an XML file or a database - Create maps and books, exploiting numerous interactive features available in PDF - Add bookmarks, page numbers, watermarks, and other features to existing PDF documents - Split or concatenate pages from existing PDF files - Fill out interactive forms - Serve dynamically generated or manipulated PDF documents to a web browser\n" +
"      "));
      
       document.add(new Paragraph("Aasanka Sampath"));
      
      document.close(); 
      }
}

 
/**
 *
 * @author Administrateur
 */


   
  
