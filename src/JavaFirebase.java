import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class JavaFirebase {

	public static void main(String[] args) throws InterruptedException {
	    //Firebase.setAndroidContext(this);
		Firebase rootRef = new Firebase("https://testejava.firebaseio.com/");
		//rootRef.child("casa").setValue("Ol�");
		
		rootRef.child("casa").addValueEventListener(new ValueEventListener() {
			
			@Override
			public void onDataChange(DataSnapshot snap) {
				System.out.println(snap.getValue()); 
			}
			
			@Override
			public void onCancelled(FirebaseError arg0) {}
		});
		// ap�s esse tempo, a conex�o � mantida, e n�o acaba nunca
		Thread.sleep(2000);
	}

}
