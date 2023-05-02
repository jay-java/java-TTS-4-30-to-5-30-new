package collectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
	private int id;
	private String name;
	private List<Long> contact;
	private Set<String> frds;
	private Map<Long, String> bank_acc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Long> getContact() {
		return contact;
	}
	public void setContact(List<Long> contact) {
		this.contact = contact;
	}
	public Set<String> getFrds() {
		return frds;
	}
	public void setFrds(Set<String> frds) {
		this.frds = frds;
	}
	public Map<Long, String> getBank_acc() {
		return bank_acc;
	}
	public void setBank_acc(Map<Long, String> bank_acc) {
		this.bank_acc = bank_acc;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + ", frds=" + frds + ", bank_acc="
				+ bank_acc + "]";
	}
	
}
