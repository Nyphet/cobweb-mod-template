![Cobweb Mod Template banner](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/cobweb-mod-template/banner.png "Cobweb Mod Template banner")

---

![Minecraft](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/minecraft/minecraft.svg "Minecraft")[![1.20.4](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/minecraft/1-20-4.svg "1.20.4")](https://modrinth.com/mod/cobweb-mod-template/versions?g=1.20.4)

![Loader](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/loader/loader.svg "Loader")[![NeoForge](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/loader/neoforge.svg "NeoForge")](https://modrinth.com/mod/cobweb-mod-template/versions?l=neoforge)![Separator](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/separator.svg)[![Forge](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/loader/forge.svg "Forge")](https://modrinth.com/mod/cobweb-mod-template/versions?l=forge)![Separator](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/separator.svg)[![Fabric](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/loader/fabric.svg "Fabric")](https://modrinth.com/mod/cobweb-mod-template/versions?l=fabric)

![Overlay](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/side/client-server.svg)

![Issues](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/github/issues.svg "Issues")[![GitHub](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/github/github.svg "GitHub")](https://github.com/crystal-nest/cobweb-mod-template/issues)

---

## **Description**

Multiloader skeleton for Minecraft mods!  
Built on [Jared's MultiLoaderTemplate](https://github.com/jaredlll08/MultiLoader-Template), with the addition of:

- Tasks to publish on GitHub, Modrinth, and CurseForge.
- [Cobweb](https://modrinth.com/mod/cobweb) API dependency.
- A little bit more Javadoc.
- Code style changes.

## **Setup completion**

To complete the setup:

- Change the [Support us](#support-us) section and the banner link.
- Add your project CurseForge ID in the `gradle.properties`.
- Replace the placeholder values in `api-keys.properties`.
- Update the changelog with proper release notes.
- Run the task `common > Tasks > vanilla gradle > decompile`
- Run the task `forge > Tasks > forgegradle runs > genIntellijRuns`

## Removing Platforms and Loaders

While this template includes support for Fabric, Forge, and NeoForge, you can easily remove support for the ones you don't need.  
This can be done by deleting the subproject folder and then removing it from the associated `include` in the `settings.gradle` file.

The same thing applies for the different publishing platforms, GitHub, Modrinth, and CurseForge.  
To remove support for the ones you don't need just remove the plugin declaration and use in the root `build.gradle`.

## **License and right of use**

Feel free to use this mod template for any mod, just be sure to give credit and possibly link [here](https://github.com/crystal-nest/cobweb-mod-template#readme).  
This project is published under the [GNU General Public License v3.0](https://github.com/crystal-nest/cobweb-mod-template/blob/master/LICENSE).

## **Support us**

[![Crystal Nest Website](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/crystal-nest/pic64.png "Crystal Nest Website")](https://crystalnest.it)
[![Twitch](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/twitch/twitch64.png "Twitch")](https://www.twitch.tv/crystal_spider_)
[![Patreon](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/patreon/patreon64.png "Patreon")](https://www.patreon.com/crystalspider)
[![Ko-fi](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/kofi/kofi64.png "Ko-fi")](https://ko-fi.com/crystalspider)
[![GitHub](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/github/github64.png "Our other projects")](https://github.com/crystal-nest)
[![Modrinth](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/modrinth/modrinth64.png "Modrinth")](https://modrinth.com/user/CrystalSpider)
[![Curseforge](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/curseforge/curseforge64.png "Curseforge")](https://www.curseforge.com/members/crystal_spider_/projects)

[![Bisect Hosting](https://www.bisecthosting.com/partners/custom-banners/d559b544-474c-4109-b861-1b2e6ca6026a.webp "Bisect Hosting")](https://bisecthosting.com/crystalspider)
