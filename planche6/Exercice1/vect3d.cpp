#include<iostream>
#include"vect3d.h"

vect3d::vect3d(double a,double b,double c): vecteur2d(a,b),z(c){}//l'ideal
void vect3d::affiche(){
 vecteur2d::affiche();
 std::cout<<"et z= "<<z<<std::endl;

}
float vect3d::getZ () const{
 return z;
}

void vect3d::deplacer(double dx,double dy,double dz){
    vecteur2d::deplacer(dx,dy);
    z+=dz;

}
