package entities;

public class Pension {
	private Client client = new Client(null, null);

	public Pension(Client client) {
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}
