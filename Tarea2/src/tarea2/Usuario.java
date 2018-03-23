/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Wil
 */
public class Usuario {
    
    private String usernames;
    private String fullnames;
    private String pass;
    private String typeid;
    private String id;
    private String typeuser;

    @Override
    public String toString() {
        return "Users{" + "usernames=" + getUsernames() + ", fullnames=" + getFullnames() + ", pass=" + getPass() + ", typeid=" + getTypeid() + ", id=" + getId() + ", typeuser=" + getTypeuser() + '}';
    }

    public Usuario() {
    }

    public Usuario(String usernames, String fullnames, String pass, String typeid, String id, String typeuser) {
        this.usernames = usernames;
        this.fullnames = fullnames;
        this.pass = pass;
        this.typeid = typeid;
        this.id = id;
        this.typeuser = typeuser;
    }

    /**
     * @return the usernames
     */
    public String getUsernames() {
        return usernames;
    }

    /**
     * @param usernames the usernames to set
     */
    public void setUsernames(String usernames) {
        this.usernames = usernames;
    }

    /**
     * @return the fullnames
     */
    public String getFullnames() {
        return fullnames;
    }

    /**
     * @param fullnames the fullnames to set
     */
    public void setFullnames(String fullnames) {
        this.fullnames = fullnames;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the typeid
     */
    public String getTypeid() {
        return typeid;
    }

    /**
     * @param typeid the typeid to set
     */
    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the typeuser
     */
    public String getTypeuser() {
        return typeuser;
    }

    /**
     * @param typeuser the typeuser to set
     */
    public void setTypeuser(String typeuser) {
        this.typeuser = typeuser;
    }
    
}
