import groovy.transform.ToString

@ToString
class Tweet {

    String username
    String content
    Integer retweet
    Integer fav
    Date createDate

    Tweet(String user, String contentText){
        username = user
        content = contentText
        fav = 0
        retweet = 0
        createDate = new Date()
    }

    void addToRetweet(){
        retweet += 1
    }

    void addToFav(){
        fav += 1
    }

    void addToRetweet(int qtd){
        retweet += qtd
    }

    void addToFav(int qtd){
        fav += qtd
    }
}
