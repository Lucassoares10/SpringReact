import DataTable from 'compents/DataTable';
import Foorter from 'compents/Footer';
import Navbar from 'compents/Navbar';

function App() {
  return (
    <>
      <Navbar />
      <div>
        <h1 className="container">Pagina de vendas</h1>
      <DataTable  />
      </div>
      <Foorter  />
    </>
  );
}

export default App;
