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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            proveedores.ReservaPersRequest resRequest = new proveedores.ReservaPersRequest();
            proveedores.ReservaPersBinding resBinding = new proveedores.ReservaPersBinding();

            resRequest.ski = false;
            resRequest.material = false;
            resRequest.profesor = false;
            resRequest.alojamiento = false;

            if (checkBox1.Checked) resRequest.ski = true;
            if (checkBox2.Checked) resRequest.material = true;
            if (checkBox3.Checked) resRequest.profesor = true;
            if (checkBox4.Checked) resRequest.alojamiento = true;

            resRequest.unidades = Int32.Parse(textBox1.Text);

            proveedores.ReservaPersResponse response = resBinding.process(resRequest);
            string str = response.precio.ToString();
            str += " "+response.proveedor;

            textBox2.Text = str;
                
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
