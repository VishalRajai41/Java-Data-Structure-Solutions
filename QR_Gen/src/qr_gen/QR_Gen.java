/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qr_gen;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author RAJAI VISHAL
 */
public class QR_Gen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String details="Rajai VIshal - Channel Name: Vishal Rajai";
        ByteArrayOutputStream out=QRCode.from(details).to(ImageType.PNG).stream();
        
        File file= new File("C:\\Users\\RAJAI VISHAL\\Downloads\\QR_Gen\\Myqr_Gen.png");
        FileOutputStream fos=new FileOutputStream(file);
        
        fos.write(out.toByteArray());
        fos.flush();
    }
    
}
