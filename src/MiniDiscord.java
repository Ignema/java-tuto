public class MiniDiscord extends Discord{

    private String phoneNumber;

    MiniDiscord(Long id, String userName, String image, String phoneNumber){
        super(id, userName,image);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Discord[] createUsers(String[] userNames){
        Discord[] discords = super.createUsers(userNames);
        discords[0].setImage("LEILABOUIDRA.jpg");
        return discords;
    }
}
