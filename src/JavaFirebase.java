import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class JavaFirebase {

	public static void main(String[] args) throws InterruptedException {
	    //Firebase.setAndroidContext(this);
		Firebase rootRef = new Firebase("https://testejava.firebaseio.com/");
		//rootRef.child("casa").setValue("Olá");
		
		rootRef.child("casa").addValueEventListener(new ValueEventListener() {
			
			@Override
			public void onDataChange(DataSnapshot snap) {
				System.out.println(snap.getValue()); 
			}
			
			@Override
			public void onCancelled(FirebaseError arg0) {}
		});
		// após esse tempo, a conexão é mantida, e não acaba nunca
		Thread.sleep(2000);
	}

}
