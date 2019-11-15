package Request_Response;

import org.zeromq.ZMQ;

public class Request {

	public static void main(String[] args) {

		ZMQ.Context context=ZMQ.context(1);     
        ZMQ.Socket socket=context.socket(ZMQ.REQ);         

        socket.connect("tcp://127.0.0.1:5557");     

        for (int i = 0; i < 10; i++) {

            long now = System.currentTimeMillis();
            String request = "hello, time is "+now;
            
            socket.send(request.getBytes());
            byte[] response=socket.recv();

            System.out.println("Request1 recv:\t"+new String(response));
        }
        socket.send("END".getBytes());
        
        socket.close();
        context.term();
		
	}

}
