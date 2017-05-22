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
    public partial class ModificarReserva : Form
    {
        public ModificarReserva()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            gesReserva.GestionReserva gesReserva = new gesReserva.GestionReserva();
            string salida;
            /*gesReserva.CrearReserva(reserva.fechaEntrada, reserva.fechaSalida,
                reserva.nombreCliente, reserva.emailCliente, reserva.precio,
                reserva.ski, reserva.material, reserva.profesor, reserva.alojamiento, out salida);*/
            
        }
    }
}
