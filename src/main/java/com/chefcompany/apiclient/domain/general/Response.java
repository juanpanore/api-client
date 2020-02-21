package com.chefcompany.apiclient.domain.general;

public class Response {
	
	   protected boolean successful;

	    protected Object body;
	    
	    protected Object data;

	    protected Response() {

	    }

	    protected Response(boolean successful, Object body) {
	        super();
	        this.successful = successful;
	        this.body = body;
	    }
	    
	    protected Response(boolean successful, Object body, Object data) {
	        super();
	        this.successful = successful;
	        this.body = body;
	        this.data = data;
	    }

	    public boolean issuccessful() {
	        return successful;
	    }

	    public Object getbody() {
	        return body;
	    }
	    
	    public Object getdata() {
	        return data;
	    }
	    
	    public static class Builder {

	        private boolean successful;

	        private Object body;
	        
	        private Object data;

	        private Builder() {

	        }

	        public Builder successful(boolean valor) {
	            successful = valor;
	            return this;
	        }

	        public Builder successful() {
	            successful = true;
	            return this;
	        }

	        public Builder fallo() {
	            successful = false;
	            return this;
	        }

	        public Builder body(Object valor) {
	            body = valor;
	            return this;
	        }
	        
	        public Builder data(Object valor) {
	            data = valor;
	            return this;
	        }

	        public Response build() {
	            return new Response(successful, body, data);
	        }

	    }

	    public static Builder builder() {
	        return new Builder();
	    }

}
