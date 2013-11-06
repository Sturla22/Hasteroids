public class Interval {
    // Tilviksbreytur fyrir endapunkta
    private final double left,right;
    // Notkun: i = Interval(l,r)
    // Fyrir:  l<r
    // Eftir:  i er bilid milli l og r
    public Interval(double l,double r){
    	this.left=l;
    	this.right=r;
    }
    // Notkun: l = i.getLeft()
    // Fyrir:  bilid i er til
    // Eftir:  l jafngildir vinstri morkum i
    public double getLeft() {return left;}
	// Notkun: r = i.getRight()
    // Fyrir:  bilid i er til
    // Eftir:  r jafngildir haegri morkum i
	public double getRight() {return right;}
    // Notkun: foo = i.contains(x)
    // Fyrir:  bilid i er til, x er tala
    // Eftir:  foo segir til um hvort x se a bilinu i
    public boolean contains(double x){
    	return ((x>left)&&x<(right));
    }
    // Notkun: bob = i.includes(b)
    // Fyrir:  bilid i er til, bilid b er til
    // Eftir:  bob segir til um hvort b se innan beggja marka i
    public boolean includes(Interval b){
    	return (this.contains(b.left)&&this.contains(b.right));
    }
    // Notkun: alice = i.inntersects(b)
    // Fyrir:  bilid i er til, bilid b er til
    // Eftir:  alice segir til um hvort b skarist vid i
    public boolean intersects(Interval b){
    	return (((b.left>this.left)&&(b.left<this.right))||((b.right>this.left)&&(b.right<this.right)));
    }
    // Notkun: bar = i.toString()
    // Fyrir:  bilid i er til
    // Eftir:  bar er strengjatulkun bilsins [i.left,i.right]
    public String toString(){
    	return "[" + left + "," + right + "]";
    }
}