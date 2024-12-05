#ifndef PIECE_H
#define PIECE_H
#include<string>

class piece
{
    protected:
        std::string type;
        double x;
        double y;
        std::string color;
    public:
        piece(std::string,double,double,std::string);
        void deplacer();
        void afficher()const;

        virtual ~piece();



    private:
};

#endif // PIECE_H
