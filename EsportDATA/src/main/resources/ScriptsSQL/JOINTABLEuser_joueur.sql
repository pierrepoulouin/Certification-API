SELECT *
FROM Utilisateur
INNER JOIN joueur 
ON Joueur.userid = Utilisateur.userid;