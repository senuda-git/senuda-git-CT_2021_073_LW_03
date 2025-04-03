package Q_04;

class Owner{
    // Data Member
    private String ownerName;
    private String phoneNo;
    private String model;

    //Constructor:
    public Owner(String ownerName, String phoneNo, String model) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
        this.model = model;
    }

    //Returns the name of this bicycle's owner
    public String getOwnerName() {
        return ownerName;
    }

    //Assigns the name of this bicycle's owner
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    //Returns the phoneNo of this bicycle's owner
    public String getPhoneNo() {
        return phoneNo;
    }

    //Assigns the name of this bicycle's owner
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    //Returns the model of this bicycle
    public void setModel(String model) {
        this.model = model;
    }

    //Assigns the model of this bicycle
    public String getModel() {
        return model;
    }

}