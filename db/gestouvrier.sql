-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mar. 07 août 2018 à 08:54
-- Version du serveur :  10.1.34-MariaDB
-- Version de PHP :  7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestouvrier`
--

-- --------------------------------------------------------

--
-- Structure de la table `departement_by_region`
--

CREATE TABLE `departement_by_region` (
  `id_departement` int(11) NOT NULL,
  `id_region` int(11) NOT NULL,
  `departement` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `departement_by_region`
--

INSERT INTO `departement_by_region` (`id_departement`, `id_region`, `departement`) VALUES
(1, 1, 'Dakar'),
(2, 1, 'Guédiawaye'),
(3, 1, 'Pikine'),
(4, 1, 'Rufisque'),
(5, 2, 'Thiès'),
(6, 2, 'Mbour'),
(7, 2, 'Tivaouane'),
(8, 3, 'Diourbel'),
(9, 3, 'Bambey'),
(10, 3, 'Mbacké'),
(11, 4, 'Fatick'),
(12, 4, 'Foundiougne'),
(13, 4, 'Gossas'),
(14, 5, 'Kaffrine'),
(15, 5, 'Birkilane'),
(16, 5, 'Malem-Hodar'),
(17, 5, 'Koungheul'),
(18, 6, 'Kaolack'),
(19, 6, 'Guinguinéo'),
(20, 6, 'Nioro du Rip'),
(21, 7, 'Kédougou'),
(22, 7, 'Salemata'),
(23, 7, 'Saraya'),
(24, 8, 'Kolda'),
(25, 8, 'Vèlingara'),
(26, 8, 'Mèdina Yoro Foulah'),
(27, 9, 'Louga'),
(28, 9, 'Kèbèmer'),
(29, 9, 'Linguère'),
(30, 10, 'Matam'),
(31, 10, 'Kanel'),
(32, 10, 'Ranèrou'),
(33, 11, 'Saint-Louis'),
(34, 11, 'Dagana'),
(35, 11, 'Podor'),
(36, 12, 'Sédhiou'),
(37, 12, 'Bounkiling'),
(38, 12, 'Goudomp'),
(39, 13, 'Tambacounda'),
(40, 13, 'Bakel'),
(41, 13, 'Koumpentoum'),
(42, 13, 'Goudiry'),
(43, 14, 'Ziguinchor'),
(44, 14, 'Bignogna'),
(45, 14, 'Oussouye');

-- --------------------------------------------------------

--
-- Structure de la table `domaine`
--

CREATE TABLE `domaine` (
  `id_domaine` int(11) NOT NULL,
  `domaine` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `domaine`
--

INSERT INTO `domaine` (`id_domaine`, `domaine`) VALUES
(1, 'Construction'),
(2, 'Automobile');

-- --------------------------------------------------------

--
-- Structure de la table `metier_by_domaine`
--

CREATE TABLE `metier_by_domaine` (
  `id_metier` int(11) NOT NULL,
  `id_domaine` int(11) NOT NULL,
  `metier` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `metier_by_domaine`
--

INSERT INTO `metier_by_domaine` (`id_metier`, `id_domaine`, `metier`) VALUES
(1, 1, 'Maçcon'),
(2, 1, 'Menuisier'),
(3, 1, 'Maçcon'),
(4, 1, 'Mecanicien'),
(5, 1, 'Electricien'),
(6, 1, 'Peintre'),
(7, 1, 'Plombier'),
(8, 2, 'Moteuriste'),
(9, 2, 'Tollier'),
(10, 2, 'Mecanicien'),
(11, 2, 'Electricien'),
(12, 2, 'Peintre'),
(13, 2, 'Chauffeur');

-- --------------------------------------------------------

--
-- Structure de la table `ouvrier`
--

CREATE TABLE `ouvrier` (
  `id_ouvrier` int(11) NOT NULL,
  `id_domaine` int(11) NOT NULL,
  `id_metier` int(11) NOT NULL,
  `id_departement` int(11) NOT NULL,
  `nom_ouvrier` varchar(40) NOT NULL,
  `prenom_ouvrier` varchar(40) NOT NULL,
  `telephone` int(11) NOT NULL,
  `email` varchar(40) DEFAULT NULL,
  `experience` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `pays`
--

CREATE TABLE `pays` (
  `id_pays` int(11) NOT NULL,
  `pays` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `pays`
--

INSERT INTO `pays` (`id_pays`, `pays`) VALUES
(1, 'Senegal');

-- --------------------------------------------------------

--
-- Structure de la table `region_by_pays`
--

CREATE TABLE `region_by_pays` (
  `id_region` int(11) NOT NULL,
  `id_pays` int(11) NOT NULL,
  `region` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `region_by_pays`
--

INSERT INTO `region_by_pays` (`id_region`, `id_pays`, `region`) VALUES
(1, 1, 'Dakar'),
(2, 1, 'Thies'),
(3, 1, 'Diourbel'),
(4, 1, 'Fatick'),
(5, 1, 'Kaffrine'),
(6, 1, 'Kaolack'),
(7, 1, 'Kédougou'),
(8, 1, 'Kolda'),
(9, 1, 'Louga'),
(10, 1, 'Matam'),
(11, 1, 'Saint-Louis'),
(12, 1, 'Sédhiou'),
(13, 1, 'Tambacounda'),
(14, 1, 'Ziguinchor');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `departement_by_region`
--
ALTER TABLE `departement_by_region`
  ADD PRIMARY KEY (`id_departement`),
  ADD KEY `id_region` (`id_region`);

--
-- Index pour la table `domaine`
--
ALTER TABLE `domaine`
  ADD PRIMARY KEY (`id_domaine`);

--
-- Index pour la table `metier_by_domaine`
--
ALTER TABLE `metier_by_domaine`
  ADD PRIMARY KEY (`id_metier`),
  ADD KEY `id_domaine` (`id_domaine`);

--
-- Index pour la table `ouvrier`
--
ALTER TABLE `ouvrier`
  ADD PRIMARY KEY (`id_ouvrier`),
  ADD KEY `id_domaine` (`id_domaine`),
  ADD KEY `id_metier` (`id_metier`),
  ADD KEY `id_departement` (`id_departement`);

--
-- Index pour la table `pays`
--
ALTER TABLE `pays`
  ADD PRIMARY KEY (`id_pays`);

--
-- Index pour la table `region_by_pays`
--
ALTER TABLE `region_by_pays`
  ADD PRIMARY KEY (`id_region`),
  ADD KEY `id_pays` (`id_pays`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `departement_by_region`
--
ALTER TABLE `departement_by_region`
  MODIFY `id_departement` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT pour la table `domaine`
--
ALTER TABLE `domaine`
  MODIFY `id_domaine` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `metier_by_domaine`
--
ALTER TABLE `metier_by_domaine`
  MODIFY `id_metier` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT pour la table `ouvrier`
--
ALTER TABLE `ouvrier`
  MODIFY `id_ouvrier` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `pays`
--
ALTER TABLE `pays`
  MODIFY `id_pays` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `region_by_pays`
--
ALTER TABLE `region_by_pays`
  MODIFY `id_region` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `departement_by_region`
--
ALTER TABLE `departement_by_region`
  ADD CONSTRAINT `departement_by_region_ibfk_1` FOREIGN KEY (`id_region`) REFERENCES `region_by_pays` (`id_region`);

--
-- Contraintes pour la table `metier_by_domaine`
--
ALTER TABLE `metier_by_domaine`
  ADD CONSTRAINT `metier_by_domaine_ibfk_1` FOREIGN KEY (`id_domaine`) REFERENCES `domaine` (`id_domaine`);

--
-- Contraintes pour la table `ouvrier`
--
ALTER TABLE `ouvrier`
  ADD CONSTRAINT `ouvrier_ibfk_1` FOREIGN KEY (`id_domaine`) REFERENCES `domaine` (`id_domaine`),
  ADD CONSTRAINT `ouvrier_ibfk_2` FOREIGN KEY (`id_metier`) REFERENCES `metier_by_domaine` (`id_metier`),
  ADD CONSTRAINT `ouvrier_ibfk_3` FOREIGN KEY (`id_departement`) REFERENCES `departement_by_region` (`id_departement`);

--
-- Contraintes pour la table `region_by_pays`
--
ALTER TABLE `region_by_pays`
  ADD CONSTRAINT `region_by_pays_ibfk_1` FOREIGN KEY (`id_pays`) REFERENCES `pays` (`id_pays`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
