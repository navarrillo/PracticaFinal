using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Cliente
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }

        private void btn_iniciarSesion_Click(object sender, EventArgs e)
        {
            String email, pass;

            email = tb_email_login.Text.ToString();
            pass = tb_pass_login.Text.ToString();

            gestionusuario.GestionUsuarios gu = new gestionusuario.GestionUsuarios();


            if (tb_email_login.Text.Equals("admin") && tb_pass_login.Text.Equals("12345"))
            {
                btn_iniciarSesion.Text = "Bienvenido";
                /*Proveedores proFrm = new Proveedores();
                proFrm.Show();*/
                Form1 frm = new Form1(email);
                frm.Show();
                this.Hide();
            }
            else {
                String salida = "";
                Boolean resultado = gu.login(email, pass, out salida);
                if (resultado == true)
                {
                    Form1 frm = new Form1(email);
                    frm.Show();

                    this.Hide();
                }
                MessageBox.Show("No existe ese usuario");
            }
        }

        private void Reserva_Click(object sender, EventArgs e)
        {
            /*Form1 frm = new Form1();
            frm.Show();

            this.Hide();*/
        }
    }
}
