package inner;

class WithInner{
	class Inner{}
}

public class InheritInner extends WithInner.Inner{
	
//	InheritInner(){}
	
	InheritInner(WithInner wi){
		wi.super();
//		enclosingClassReference.super();
		System.out.println("InheritInner");
	}
	
	public static void main(String[] args){
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}

}
