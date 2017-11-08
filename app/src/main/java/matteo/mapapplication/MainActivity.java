package matteo.mapapplication;

import android.location.Location;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    LatLng userLocation = new LatLng(0,0);
    LatLng user1Location= new LatLng(0,0);
    LatLng user2Location= new LatLng(0,0);
    LatLng user3Location= new LatLng(0,0);
    SupportMapFragment mapFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        Log.d("Main Activity", "Map is ready!");
        LatLng sydney = new LatLng(-33.852, 151.211);
        map.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    public void onClick(View view){
        List<User> utenti = new List<User>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NonNull
            @Override
            public Iterator<User> iterator() {
                return null;
            }

            @NonNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NonNull
            @Override
            public <T> T[] toArray(@NonNull T[] a) {
                return null;
            }

            @Override
            public boolean add(User user) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NonNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(@NonNull Collection<? extends User> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, @NonNull Collection<? extends User> c) {
                return false;
            }

            @Override
            public boolean removeAll(@NonNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(@NonNull Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public User get(int index) {
                return null;
            }

            @Override
            public User set(int index, User element) {
                return null;
            }

            @Override
            public void add(int index, User element) {

            }

            @Override
            public User remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @NonNull
            @Override
            public ListIterator<User> listIterator() {
                return null;
            }

            @NonNull
            @Override
            public ListIterator<User> listIterator(int index) {
                return null;
            }

            @NonNull
            @Override
            public List<User> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        User user = new User();
        user.setFirstName("Andrea");
        user.setLocation(15, 12);
        utenti.add(user);
        User user1 = new User();
        user1.setFirstName("Matteo");
        user1.setLocation(15, 25);
        utenti.add(user1);
        User user2 = new User();
        user2.setFirstName("Fabrizio");
        user2.setLocation(30, 12);
        utenti.add(user2);
        User user3 = new User();
        user3.setFirstName("Alessandro");
        user3.setLocation(30, 25);
        utenti.add(user3);
        userLocation = new LatLng(user.getLocation().getLatitude(), user.getLocation().getLongitude());
        user1Location = new LatLng(user1.getLocation().getLatitude(), user1.getLocation().getLongitude());
        user2Location = new LatLng(user2.getLocation().getLatitude(), user2.getLocation().getLongitude());
        user3Location = new LatLng(user3.getLocation().getLatitude(), user3.getLocation().getLongitude());
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap map) {
                map.addMarker(new MarkerOptions().position(userLocation).title("User"));
                map.moveCamera(CameraUpdateFactory.newLatLng(userLocation));
                map.addMarker(new MarkerOptions().position(user1Location).title("User 1"));
                map.moveCamera(CameraUpdateFactory.newLatLng(user1Location));
                map.addMarker(new MarkerOptions().position(user2Location).title("User 2"));
                map.moveCamera(CameraUpdateFactory.newLatLng(user2Location));
                map.addMarker(new MarkerOptions().position(user3Location).title("user 3"));
                map.moveCamera(CameraUpdateFactory.newLatLng(user3Location));
            }
        });

    }
}
