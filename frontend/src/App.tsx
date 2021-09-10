import BarChart from 'compents/BarChart';
import DataTable from 'compents/DataTable';
import DonutChart from 'compents/DonutChart';
import Foorter from 'compents/Footer';
import Navbar from 'compents/Navbar';

function App() {
  return (
    <>
      <Navbar />
      <div className="container">

        <h1 className="text-primary py-3">Dashboard de Vendas</h1>
        <div className="row">

          <div className="row px-3">
            <div className="col-sm-6">
                <h5 className="text-center text-secondary">Taxa de Sucesso(%)</h5>
              <BarChart />
                </div>
                <div className="col-sm-6">
                <h5>Todas Vendas</h5>
              <DonutChart />
                </div>
          </div>

        </div>
        
        <div className="py-3">
         <h2 className="text-primary">
          Todas as vendas
         </h2>
        </div>

        <DataTable />
      </div>
      <Foorter />
    </>
  );
}

export default App;
