using Newtonsoft.Json;
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
    public partial class RealizaReserva : Form
    {
        gesReserva.ReservaEdicion reserva;


        public RealizaReserva(gesReserva.ReservaEdicion reserva, string proveedor, string personas)

        {
            InitializeComponent();
            this.reserva = reserva;
            textBox2.Text = reserva.nombreCliente;
            textBox1.Text = reserva.emailCliente;
            textBox3.Text = reserva.fechaEntrada.ToString();
            textBox4.Text = reserva.fechaSalida.ToString();
            textBox5.Text = reserva.precio.ToString()+" €";
            textBox6.Text = proveedor;
            textBox7.Text = reserva.ski.ToString();
            textBox8.Text = reserva.material.ToString();
            textBox9.Text = reserva.profesor.ToString();
            textBox10.Text = reserva.alojamiento.ToString();
            textBox11.Text = personas;
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label11_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            gesReserva.GestionReserva gesReserva = new gesReserva.GestionReserva();
            string salida;
            gesReserva.CrearReserva(reserva.fechaEntrada, reserva.fechaSalida, 
                reserva.nombreCliente, reserva.emailCliente, reserva.precio, 
                reserva.ski,reserva.material, reserva.profesor, reserva.alojamiento, out salida);
            MessageBox.Show(salida);

            this.Close();

             /*gesReserva.GestionReserva gesReserva = new gesReserva.GestionReserva();
             string salida;*/

            /*var httpWebRequest = (HttpWebRequest)WebRequest.Create("http://localhost:9090/gestionreserva");
            httpWebRequest.ContentType = "application/json";
            httpWebRequest.Method = "POST";

            using (var streamWriter = new StreamWriter(httpWebRequest.GetRequestStream()))
            {
                string json = "{\"ski\":" + ski + "," +
                             "\"material\":" + material + "," +
                             "\"profesor\":" + profesor + "," +
                             "\"alojamiento\":" + alojamiento + "," +
                              "\"unidades\":" + unidades + "}";
                streamWriter.Write(json);
                streamWriter.Flush();
                streamWriter.Close();
            }

            var httpResponse = (HttpWebResponse)httpWebRequest.GetResponse();
            using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
            {
                var result = streamReader.ReadToEnd();
                MessageBox.Show(result);
            }*/

        }
    }
}
