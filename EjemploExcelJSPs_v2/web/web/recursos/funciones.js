/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var capa;
function cambio (idCapa){
    //se recupera la capa segun el elemento disponible
    
   if (document.layers)
       capa = eval("document." + idCapa);
   if (document.all)
       capa = eval (idCapa + ".style");
   if (document.getElementById())
       capa = eval('document.getElementById("' + idCapa + '").style');
   
   //si esta visible la capa la ocultamos o viceversa
   
   if (capa.visibility =="hidden") || (capa.visibility=="hide"){
       capa.visibility = (document.layers) ? "show" :"visible";
   }else {
       capa.visibility = (document.layers) ? "hide" :"hidden";
   }
       
        
}


