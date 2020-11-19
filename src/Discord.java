public class Discord {

    private Long id;
    private String userName;
    private String image;

    Discord(){
        this.id = 0L;
        this.userName = "user";
        this.image = "https://image.com/asdhukasdh.png";
    }

    Discord(Long id){
        this.id = id;
        this.userName = "user #" + id;
        this.image = "https://image.com/asdhukasdh.png";
    }

    Discord(Long id, String userName, String image){
        this.id = id;
        this.userName = userName;
        this.image = image;
    }

    Discord(Discord discord){
        this.id = discord.getId();
        this.userName = discord.getUserName();
        this.image = discord.getImage();
    }

    public String getUserName() {
        return userName;
    }

    public String getImage() {
        return image;
    }

    public Long getId(){
        if (id==5L){
            return 6L;
        }
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setImage(String image) {
        this.image = image;
    }

//    public Discord[] createUsersWithoutInitialisation(String[] userNames){
//        return new Discord[userNames.length];
//    }

    public Discord[] createUsers(String[] userNames){
        Discord[] discords = new Discord[userNames.length];
        for (int i=0; i< userNames.length; i++){
            discords[i] = new Discord((long) i, userNames[i], "image" + i + ".png");
        }
        return discords;
    }

    @Override
    public String toString() {
        return "Discord{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public Boolean equals(Discord discord){
        return this.id.equals(discord.getId()) && this.userName.equals(discord.getUserName()) && this.image.equals(discord.getImage());
    }
}