grammar Xml_clase;
programa: xml;
xml: tags;
tags: open_tag data close_tag;

open_tag : TAGIN TEXT TAGFI;
         
data: tags+ 
    | TEXT;

close_tag: TAGIN SLASH TEXT TAGFI;

TAGIN: '<';
TAGFI: '>';
IGUAL: '=';
COMILLA: '"';
SLASH: '/';
TEXT: .+;

ESPACIOS: [ \t\r\n]+ -> skip;