package com.train.pojo;

public class User {
private String uname;
private int uid;
private String uadd;
private String uemail;
private String password;
public String getUname() {
 return uname;
}
public void setUname(String uname) {
 this.uname = uname;
}
public int getUid() {
return uid;
}
public void setUid(int uid) {
this.uid = uid;
}
public User() {
super();
// TODO Auto-generated constructor stub
}
public User(String uname, int uid, String uadd, String uemail, String password) {
 super();
 this.uname = uname;
 this.uid = uid;
this.uadd = uadd;
this.uemail = uemail;
this.password = password;
}
public String getUadd() {
 return uadd;
}
public void setUadd(String uadd) {
this.uadd = uadd;
}
public String getUemail() {
 return uemail;
}
public void setUemail(String uemail) {
 this.uemail = uemail;
}
public String getPassword() {
 return password;
}
public void setPassword(String password) {
 this.password = password;
}
}

