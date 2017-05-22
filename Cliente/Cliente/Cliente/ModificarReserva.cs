using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Cliente
{
    public partial class ModificarReserva : Form
    {
        gesReserva.ReservaEdicion reserva;
        public ModificarReserva(gesReserva.ReservaEdicion reservaEdit)
        {

            InitializeComponent();
            this.reserva = reservaEdit;
            textBox1.Text = reserva.nombreCliente;
            textBox2.Text = reserva.emailCliente;
            textBox3.Text = reserva.fechaEntrada.ToString();
            textBox4.Text = reserva.fechaSalida.ToString();
            textBox5.Text = reserva.precio.ToString();
            textBox7.Text = reserva.ski.ToString();
            textBox8.Text = reserva.material.ToString();
            textBox9.Text = reserva.profesor.ToString();
            textBox10.Text = reserva.alojamiento.ToString();

        }

        private void button1_Click(object sender, EventArgs e)
        {
            gesReserva.GestionReserva gesReserva = new gesReserva.GestionReserva();
            string salida;

            var httpWebRequest = (HttpWebRequest)WebRequest.Create("http://localhost:9091/flujo1");
            httpWebRequest.ContentType = "application/json";
            httpWebRequest.Method = "POST";

            using (var streamWriter = new StreamWriter(httpWebRequest.GetRequestStream()))
            {
                string json = "{\"numUnidades\":\"" + textBox1.Text + "\"," +
                             "\"referenciaProducto\":\"" + textBox2.Text + "\"," +
                              "\"soapkey\":\"" + textBox3.Text + "\"}";

                streamWriter.Write(json);
                streamWriter.Flush();
                streamWriter.Close();
            }

            var httpResponse = (HttpWebResponse)httpWebRequest.GetResponse();
            using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
            {
                var result = streamReader.ReadToEnd();
                textBox4.Text = result;

                bool correcto = gesReserva.EditarReserva(reserva.id,reserva.fechaEntrada, reserva.fechaSalida,
                reserva.nombreCliente, reserva.emailCliente, reserva.precio,
                reserva.ski, reserva.material, reserva.profesor, reserva.alojamiento, out salida);
            MessageBox.Show(salida);

            this.Close();

        }
    }
}
