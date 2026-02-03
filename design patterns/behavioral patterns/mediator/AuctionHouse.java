import java.util.ArrayList;
import java.util.List;

public class AuctionHouse implements AuctionMediator{
    private List<Bidder> bidderList;

    public AuctionHouse(){
        this.bidderList = new ArrayList<>();
    }

    @Override
    public void registerBidder(Bidder bidder){
        bidderList.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int amount){
        System.out.println(bidder.getName() + " placed a bid of " + amount);
        for(Bidder b: bidderList){
            if(b != bidder){
                b.receiveBid(bidder, amount);
            }
        }
    }
}
