package Basic_Java.String_NS;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DeclareString {
    public static void main(String[] args) {
        String way1="vaibhav";
        String way4="vaibhav";
        String way2=new String("vaibhav");
        String way3=new String("vaibhav");

        System.out.println( way2 == way3 );
        System.out.println( way1 == way4 );
    }
}
