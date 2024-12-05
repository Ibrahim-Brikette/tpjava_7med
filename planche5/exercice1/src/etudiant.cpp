#include "etudiant.h"
#include<string>
#include<iostream>

        etudiant::etudiant(std::string n,int nbr):nom(n),nbrNotes(nbr){
            tabNotes=new double[n];
        }
        etudiant::etudiant(const etudiant &e){


            nom=e.nom;
            nbrNotes=e.nbrNotes;
           double *tabNotes=new double[nbrNotes=e.nbrNotes];
            for (int i=0;i<nbrNotes;i++){
                tabNotes[i]=e.tabNotes[i];
            }

        }

        std::string etudiant::getNom() const{
            return nom;
        }
        int etudiant::getNbrNotes()const{
            return nbrNotes;
        }
        void etudiant::setNom(std::string n){
            nom=n;


        }
        void  etudiant::setNbrNotes(int n){
            nbrNotes=n;

        }
        void etudiant::saisie(){
            int note;
            for(int i=0;i<nbrNotes;i++){
                std::cout<<"donner la note "<<i+1;
                std::cin>>note;
                tabNotes[i]=note;

            }

        }
        void etudiant::affichage(){
            std::cout<<"les notes de l'etudiant "<<nom;
            for (int i=0;i<nbrNotes;i++){
                std::cout<< tabNotes[i];
            }

        }
        float etudiant::moyenne()const{
            double moyenne;
            for (int i=0;i<nbrNotes;i++){
                moyenne+= tabNotes[i];
            }
            return (double)moyenne/nbrNotes;



        }
        bool etudiant::admis()const{
            return this->moyenne()>=10;
        }
