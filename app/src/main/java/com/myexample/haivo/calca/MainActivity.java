package com.myexample.haivo.calca;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public int oper = 0;
    public Double num1 = 0.0, num2 = 0.0, Result = 0.0;
    public String Snum1 = null, Snum2 = null;

    Button btn0, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnSub, btnMul;
    Button btn2, btnDiv, btnC, btnEqu, btnDot, btn1;

    TextView tvNum1;
    TextView tvNum2;
    TextView tvResult;
    TextView tvOper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = (Button) findViewById(R.id.button10);
        btn3 = (Button) findViewById(R.id.button11);
        btn4 = (Button) findViewById(R.id.button5);
        btn5 = (Button) findViewById(R.id.button6);
        btn6 = (Button) findViewById(R.id.button7);
        btn7 = (Button) findViewById(R.id.button);
        btn8 = (Button) findViewById(R.id.button2);
        btn9 = (Button) findViewById(R.id.button3);
        btnAdd = (Button) findViewById(R.id.button4);
        btnSub = (Button) findViewById(R.id.button8);
        btnMul = (Button) findViewById(R.id.button12);
        btnDiv = (Button) findViewById(R.id.button16);
        btnC = (Button) findViewById(R.id.button17);
        btnEqu = (Button) findViewById(R.id.button15);
        btnDot = (Button) findViewById(R.id.button13);
        btn1 = (Button) findViewById(R.id.button9);
        tvOper = (TextView) findViewById(R.id.textView5);
        tvResult = (TextView) findViewById(R.id.textView4);
        tvNum2 = (TextView) findViewById(R.id.textView3);
        tvNum1 = (TextView) findViewById(R.id.textView2);
        btn0 = (Button) findViewById(R.id.button14);

        btn0.setOnClickListener(new btn0ClickListener());
        btn1.setOnClickListener(new btn1ClickListener());
        btn2.setOnClickListener(new btn2ClickListener());
        btn3.setOnClickListener(new btn3ClickListener());
        btn4.setOnClickListener(new btn4ClickListener());
        btn5.setOnClickListener(new btn5ClickListener());
        btn6.setOnClickListener(new btn6ClickListener());
        btn7.setOnClickListener(new btn7ClickListener());
        btn8.setOnClickListener(new btn8ClickListener());
        btn9.setOnClickListener(new btn9ClickListener());
        btnAdd.setOnClickListener(new btnAddClickListener());
        btnEqu.setOnClickListener(new btnEquClickListener());
        btnSub.setOnClickListener(new btnSubClickListener());
        btnMul.setOnClickListener(new btnMulClickListener());
        btnDiv.setOnClickListener(new btnDivClickListener());
        btnC.setOnClickListener(new btnCClickListener());
        btnDot.setOnClickListener(new btnDotClickListener());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "这个按钮暂时没什么卵用。。", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    class btn0ClickListener implements View.OnClickListener {
        public void onClick(View view) {
            if (oper == 0)
                tvNum1.append("0");
            else
                tvNum2.append("0");
        }
    }

    class btn1ClickListener implements View.OnClickListener {
        public void onClick(View view) {
            if (oper == 0)
                tvNum1.append("1");
            else
                tvNum2.append("1");
        }
    }

    class btn2ClickListener implements View.OnClickListener {
        public void onClick(View view) {
            if (oper == 0)
                tvNum1.append("2");
            else
                tvNum2.append("2");
        }
    }

    class btn3ClickListener implements View.OnClickListener {
        public void onClick(View view) {
            if (oper == 0)
                tvNum1.append("3");
            else
                tvNum2.append("3");
        }
    }

    class btn4ClickListener implements View.OnClickListener {
        public void onClick(View view) {
            if (oper == 0)
                tvNum1.append("4");
            else
                tvNum2.append("4");
        }
    }

    class btn5ClickListener implements View.OnClickListener {
        public void onClick(View view) {
            if (oper == 0)
                tvNum1.append("5");
            else
                tvNum2.append("5");
        }
    }

    class btn6ClickListener implements View.OnClickListener {
        public void onClick(View view) {
            if (oper == 0)
                tvNum1.append("6");
            else
                tvNum2.append("6");
        }
    }

    class btn7ClickListener implements View.OnClickListener {
        public void onClick(View view) {
            if (oper == 0)
                tvNum1.append("7");
            else
                tvNum2.append("7");
        }
    }

    class btn8ClickListener implements View.OnClickListener {
        public void onClick(View view) {
            if (oper == 0)
                tvNum1.append("8");
            else
                tvNum2.append("8");
        }
    }

    class btn9ClickListener implements View.OnClickListener {
        public void onClick(View view) {
            if (oper == 0)
                tvNum1.append("9");
            else
                tvNum2.append("9");
        }
    }

    class btnAddClickListener implements View.OnClickListener {
        public void onClick(View view) {
            oper = 1;
            tvOper.setText("+");
            Snum1 = tvNum1.getText().toString();
            num1 = Double.valueOf(Snum1);
        }
    }

    class btnSubClickListener implements View.OnClickListener {
        public void onClick(View view) {
            oper = 2;
            tvOper.setText("-");
            Snum1 = tvNum1.getText().toString();
            num1 = Double.valueOf(Snum1);
        }
    }

    class btnMulClickListener implements View.OnClickListener {
        public void onClick(View view) {
            oper = 3;
            tvOper.setText("x");
            Snum1 = tvNum1.getText().toString();
            num1 = Double.valueOf(Snum1);
        }
    }

    class btnDivClickListener implements View.OnClickListener {
        public void onClick(View view) {
            oper = 4;
            tvOper.setText("÷");
            Snum1 = tvNum1.getText().toString();
            num1 = Double.valueOf(Snum1);
        }
    }

    class btnEquClickListener implements View.OnClickListener {
        public void onClick(View view) {
            Snum2 = tvNum2.getText().toString();
            num2 = Double.valueOf(Snum2);
            switch (oper) {
                case 0:
                    tvResult.setText("一脸懵逼");
                    break;
                case 1:
                    Result = num1 + num2;
                    tvResult.setText(String.valueOf(Result));
                    break;
                case 2:
                    Result = num1 - num2;
                    tvResult.setText(String.valueOf(Result));
                    break;
                case 3:
                    Result = num1 * num2;
                    tvResult.setText(String.valueOf(Result));
                    break;
                case 4:
                    Result = num1 / num2;
                    tvResult.setText(String.valueOf(Result));
                    break;
            }

        }
    }

    class btnCClickListener implements View.OnClickListener {
        public void onClick(View view) {
            tvNum2.setText("");
            tvNum1.setText("");
            tvResult.setText("");
            tvOper.setText("");
            oper = 0;
        }
    }

    class btnDotClickListener implements View.OnClickListener {
        public void onClick(View view) {
            //String Stv1 = tvNum1.getText().toString();
            if (oper == 0) {
                tvNum1.append(".");
            } else
                tvNum2.append(".");
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
