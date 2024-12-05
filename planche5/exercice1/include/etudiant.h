#ifndef ETUDIANT_H
#define ETUDIANT_H
#include<string>

class etudiant
{
    protected:

    private:
        static int matricule;
        std::string nom;
        int nbrNotes;
        double *tabNotes;


    public:
        static int matricule;
        etudiant(std::string n=nullptr,int notes=0);
        etudiant(const etudiant &);
        std::string getNom() const;
        int getNbrNotes()const;
        void setNom(std::string);
        void setNbrNotes(int);
        void saisie();
        void affichage();
        float moyenne()const;
        bool admis()const;



};

#endif // ETUDIANT_H
