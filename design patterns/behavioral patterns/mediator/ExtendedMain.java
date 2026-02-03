public class ExtendedMain {
    public static void main(String[] args) throws InterruptedException{
        long biddingEndTime = System.currentTimeMillis() + 5000;

        AuctionMediator auctionHouse = new ExtendedAuctionHouse(biddingEndTime);
        
        Bidder bidder1 = new Bidder("alice", auctionHouse);
        Bidder bidder2 = new Bidder("bob", auctionHouse);
        Bidder bidder3 = new Bidder("charlie", auctionHouse);

        auctionHouse.registerBidder(bidder1);
        auctionHouse.registerBidder(bidder2);
        auctionHouse.registerBidder(bidder3);

        bidder1.placeBid(100);
        Thread.sleep(2000);
        bidder2.placeBid(240);
        Thread.sleep(4000);
        bidder3.placeBid(400);
    }
}
