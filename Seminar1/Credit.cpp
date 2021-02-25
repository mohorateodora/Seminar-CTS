#include<iostream>
#include<string>
#include<fstream>

using namespace std;

enum lunaStart { ian, feb, mar, apr, mai, iun, iul, aug, sep, oct, nov, dec };
class Credit {
public:
	const int codClient = 0;
	char* numeClient = NULL;
	double valoareCredit = 0;
private:
	int anStart = 2000;
public:
	lunaStart luna = ian;
protected:
	int nrRateLunare = 0;

public:
	//constructor default
	Credit() :codClient(0) {
		this->numeClient = new char[7];
		strcpy(this->numeClient, "Anonim");
		this->valoareCredit = 0;
		this->anStart = 2000;
		this->luna = ian;
		this->nrRateLunare = 0;
	}
	//constructor cu parametrii
	Credit(int codClient, const char* numeClient) :codClient(codClient) {
		if (this->numeClient != NULL)
			delete[] this->numeClient;
		this->numeClient = new char[strlen(numeClient) + 1];
		strcpy(this->numeClient, numeClient);
		this->valoareCredit = 0;
		this->anStart = 2000;
		this->luna = ian;
		this->nrRateLunare = 0;

	}
	//destructor 
	~Credit() {
		if (this->numeClient != NULL)
			delete[] this->numeClient;
	}
	//constructor de copiere
	Credit(Credit& c) :codClient(c.codClient) {
		this->numeClient = new char[strlen(c.numeClient) + 1];
		strcpy(this->numeClient, c.numeClient);
		this->valoareCredit = c.valoareCredit;
		this->anStart = c.anStart;
		this->luna = c.luna;
		this->nrRateLunare = c.nrRateLunare;

	}
	//get si set pt anStart si nrRateLunare
	void setAnStart(int anStart) {
		if (anStart <= 2000 && anStart >= 2050)
			this->anStart = anStart;
	}
	int getAnStart() {
		return this->anStart;
	}
	void setNrRateLunare(int nrRateLunare) {
		if (nrRateLunare >= 0)
			this->nrRateLunare = nrRateLunare;
	}
	int getNrRateLunare() {
		return this->nrRateLunare;
	}
	friend ostream& operator<<(ostream& out, Credit& c);

	//operator =
	Credit operator=(Credit existent) {
		if (existent.numeClient != NULL) {
			if (this->numeClient != NULL)
				delete[]this->numeClient;
			this->numeClient = new char[strlen(existent.numeClient) + 1];
			strcpy(this->numeClient, existent.numeClient);
		}
		this->valoareCredit = existent.valoareCredit;
		this->anStart = existent.anStart;
		this->luna = existent.luna;
		this->nrRateLunare = existent.nrRateLunare;
		return existent;
	}

	//operator <
	bool operator<(Credit c) {
		if (this->valoareCredit < c.valoareCredit)
			return true;
		else
			return false;
	}

	//operator cast
	explicit operator double() {
		return valoareCredit;
	}
	//operator functie
	double operator()() {
		return valoareCredit;
	}
	friend ofstream& operator<<(ofstream& out, Credit& sursa) {
		out << endl << "id client " << sursa.codClient;
		out << endl << "valoare credit" << sursa.valoareCredit;
		out << endl << "an start " << sursa.anStart;
		out << endl << "luna start " << sursa.luna;
		out << endl << "nr rate lunare " << sursa.nrRateLunare;
		out << endl << "nume client " << sursa.numeClient;
		return out;
	}
	friend ifstream& operator<<(ifstream& in, Credit& sursa) {
		in >> sursa.codClient;
		in >> sursa.numeClient;
		in >> sursa.valoareCredit;
		in >> sursa.anStart;
		in >> sursa.luna;
		in >> sursa.numeClient;
		retrun in;
	}
};
ostream& operator<<(ostream& out, Credit& c) {
	out << endl << "-------------------------------------------";
	out << endl << c.codClient;
	out << endl << "Numele clientului este: " << c.numeClient;
	out << endl << "Valoarea creditului este: " << c.valoareCredit;
	out << endl << "Anul de start este: " << c.anStart;
	out << endl << "Luna de start este: " << c.luna;
	out << endl << "Numarul de rate lunare este: " << c.nrRateLunare;
	return out;
}
class AlgoritmDobanda {
	virtual double calculDobanda() = 0;
};

class CreditNegociat :public Credit, public AlgoritmDobanda {
	double dobandaNegociata; //rata analizata a dobanzii
	char* valoriRateLunare;
	double nrRateLunare;
public:
	double calculDobanda() {
		if (this->valoriRateLunare != NULL)
			delete[]this->valoriRateLunare;
		//this->valoriRateLunare = new double[nrRateLunare];
		return 0;
	}

	CreditNegociat() :Credit(0, "Anonim") {
		this->dobandaNegociata = 0;
		this->nrRateLunare = 0;
		this->valoriRateLunare = new char[nrRateLunare];
		for (int i = 0; i < this->nrRateLunare; i++)
			this->valoriRateLunare[i] = 0;

	}
	friend ostream& operator<<(ostream& out, CreditNegociat& c) {
		out << endl << "Dobanda negociata este: " << c.dobandaNegociata;
		out << endl << "Numarul de rate lunare: " << c.nrRateLunare;
		//pentru acest if si else codul putea fi reformatat putin
		if (c.nrRateLunare > 0) {
			out << endl << "Valorile ratelor lunare sunt:";
			for (int i = 0; i < c.nrRateLunare; i++)
				out << c.valoriRateLunare[i] << "|";
		}
		else out << endl << "Nu exista rate lunare";
		return out;
	}

};
//aceasta portiune de cod putea fi stersa deoarece nu o mai folosim in codul final

//ostream& operator<<(ostream& out, CreditNegociat& c) {
//	out << endl << "Dobanda negociata este: " << c.dobandaNegociata;
//	out << endl << "Numarul de rate lunare: " << c.nrRateLunare;
//	if (c.nrRateLunare > 0) {
//		out << endl << "Valorile ratelor lunare sunt:";
//		for (int i = 0; i < c.nrRateLunare; i++)
//			out << c.valoriRateLunare[i] << "|";
//	}
//	else out << endl << "Nu sunt rate lunare";
//	return out;
//}
int main() {
	Credit c1;
	cout << c1;
	Credit c2(1, "Ion");
	cout << c2;

	Credit c3(2, "Ina");
	cout << c3;
	c3 = c2;
	cout << c3;

	if (c1 < c2)
		cout << endl << "creditul c1 mai mic.";
	else
		cout << endl << "creditul c1 mai mare.";

	double valoareCredit = (double)c2;
	cout << endl << valoareCredit;
	cout << endl << c1();

	CreditNegociat cn1;
	cout << cn1;


	ofstream obiectAfisat;
	string numeFisier;
	cout << "Introdu nume fis: ";
	cin >> numeFisier;
	obiectAfisat.open(numeFisier, ios::out);
	if (obiectAfisat.is_open()) {
		obiectAfisat << c1;
		obiectAfisat << c2;
		obiectAfisat << c3;
	}
	obiectAfisat.close();



	ifstream obiectCitire;
	obiectCitire.open("fisier.txt", ios::in);
	if (obiectCitire.is_open()) {
		while (!obiectCitire.eof()) {
			Credit credit;
			/*obiectCitire >> credit;*/
			cout << credit;
		}

	}
	obiectCitire.close();
}