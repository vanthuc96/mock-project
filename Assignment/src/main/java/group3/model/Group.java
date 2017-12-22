package group3.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Group {
@Id
private String id;
private String group_name;
public Group() {
	
}
public Group(String id, String group_name) {

	this.id = id;
	this.group_name = group_name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getGroup_name() {
	return group_name;
}
public void setGroup_name(String group_name) {
	this.group_name = group_name;
}

}
