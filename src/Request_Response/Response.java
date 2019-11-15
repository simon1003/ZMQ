package Request_Response;

import org.zeromq.ZMQ;

public class Response{
    public static void main(String[] args) {
        ZMQ.Context context=ZMQ.context(2);    
        ZMQ.Socket socket=context.socket(ZMQ.REP);         
        socket.bind("tcp://127.0.0.1:5557");                
        while (true){
            byte[] request = socket.recv();
            if (new String(request).equals("END")) {
            	System.out.println("END ");
            	 break;
            }
            System.out.println("Response saying:\t"+new String(request));
            String response="I got it " + new String(request) ;
            socket.send(response.getBytes());
        }
        
        socket.close();
        context.term();
    }
}