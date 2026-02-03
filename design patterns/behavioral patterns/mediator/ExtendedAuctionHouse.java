public class ExtendedAuctionHouse extends AuctionHouse{
    private long biddingEndTime;
    
    public ExtendedAuctionHouse(long biddingEndTime){
        this.biddingEndTime = biddingEndTime;
    }

    @Override
    public void placeBid(Bidder bidder, int amount){
        if(System.currentTimeMillis() > biddingEndTime){
            System.out.println("Bidding time is over. No more bids accepted");
            return;
        }

        super.placeBid(bidder, amount);
    }
}
