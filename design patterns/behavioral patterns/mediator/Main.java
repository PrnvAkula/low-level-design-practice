public class Main {
    public static void main(){
        AuctionMediator auctionHouse = new AuctionHouse();

        Bidder bidder1 = new Bidder("alice", auctionHouse);
        Bidder bidder2 = new Bidder("bob", auctionHouse);
        Bidder bidder3 = new Bidder("Charlie", auctionHouse);

        auctionHouse.registerBidder(bidder1);
        auctionHouse.registerBidder(bidder2);
        auctionHouse.registerBidder(bidder3);

        bidder1.placeBid(100);
        bidder2.placeBid(150);
        bidder3.placeBid(300);
    }
}
