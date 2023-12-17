package net.dv8tion;

import net.dv8tion.jda.api.events.*;
import net.dv8tion.jda.api.events.automod.*;
import net.dv8tion.jda.api.events.channel.ChannelCreateEvent;
import net.dv8tion.jda.api.events.channel.ChannelDeleteEvent;
import net.dv8tion.jda.api.events.channel.GenericChannelEvent;
import net.dv8tion.jda.api.events.channel.forum.ForumTagAddEvent;
import net.dv8tion.jda.api.events.channel.forum.ForumTagRemoveEvent;
import net.dv8tion.jda.api.events.channel.forum.GenericForumTagEvent;
import net.dv8tion.jda.api.events.channel.forum.update.ForumTagUpdateEmojiEvent;
import net.dv8tion.jda.api.events.channel.forum.update.ForumTagUpdateModeratedEvent;
import net.dv8tion.jda.api.events.channel.forum.update.ForumTagUpdateNameEvent;
import net.dv8tion.jda.api.events.channel.forum.update.GenericForumTagUpdateEvent;
import net.dv8tion.jda.api.events.channel.update.*;
import net.dv8tion.jda.api.events.emoji.EmojiAddedEvent;
import net.dv8tion.jda.api.events.emoji.EmojiRemovedEvent;
import net.dv8tion.jda.api.events.emoji.GenericEmojiEvent;
import net.dv8tion.jda.api.events.emoji.update.EmojiUpdateNameEvent;
import net.dv8tion.jda.api.events.emoji.update.EmojiUpdateRolesEvent;
import net.dv8tion.jda.api.events.emoji.update.GenericEmojiUpdateEvent;
import net.dv8tion.jda.api.events.guild.*;
import net.dv8tion.jda.api.events.guild.invite.GenericGuildInviteEvent;
import net.dv8tion.jda.api.events.guild.invite.GuildInviteCreateEvent;
import net.dv8tion.jda.api.events.guild.invite.GuildInviteDeleteEvent;
import net.dv8tion.jda.api.events.guild.member.*;
import net.dv8tion.jda.api.events.guild.member.update.*;
import net.dv8tion.jda.api.events.guild.override.GenericPermissionOverrideEvent;
import net.dv8tion.jda.api.events.guild.override.PermissionOverrideCreateEvent;
import net.dv8tion.jda.api.events.guild.override.PermissionOverrideDeleteEvent;
import net.dv8tion.jda.api.events.guild.override.PermissionOverrideUpdateEvent;
import net.dv8tion.jda.api.events.guild.scheduledevent.*;
import net.dv8tion.jda.api.events.guild.scheduledevent.update.*;
import net.dv8tion.jda.api.events.guild.update.*;
import net.dv8tion.jda.api.events.guild.voice.*;
import net.dv8tion.jda.api.events.http.HttpRequestEvent;
import net.dv8tion.jda.api.events.interaction.GenericAutoCompleteInteractionEvent;
import net.dv8tion.jda.api.events.interaction.GenericInteractionCreateEvent;
import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.*;
import net.dv8tion.jda.api.events.interaction.component.*;
import net.dv8tion.jda.api.events.message.*;
import net.dv8tion.jda.api.events.message.react.*;
import net.dv8tion.jda.api.events.role.GenericRoleEvent;
import net.dv8tion.jda.api.events.role.RoleCreateEvent;
import net.dv8tion.jda.api.events.role.RoleDeleteEvent;
import net.dv8tion.jda.api.events.role.update.*;
import net.dv8tion.jda.api.events.self.*;
import net.dv8tion.jda.api.events.session.*;
import net.dv8tion.jda.api.events.stage.GenericStageInstanceEvent;
import net.dv8tion.jda.api.events.stage.StageInstanceCreateEvent;
import net.dv8tion.jda.api.events.stage.StageInstanceDeleteEvent;
import net.dv8tion.jda.api.events.stage.update.GenericStageInstanceUpdateEvent;
import net.dv8tion.jda.api.events.stage.update.StageInstanceUpdatePrivacyLevelEvent;
import net.dv8tion.jda.api.events.stage.update.StageInstanceUpdateTopicEvent;
import net.dv8tion.jda.api.events.sticker.GenericGuildStickerEvent;
import net.dv8tion.jda.api.events.sticker.GuildStickerAddedEvent;
import net.dv8tion.jda.api.events.sticker.GuildStickerRemovedEvent;
import net.dv8tion.jda.api.events.sticker.update.*;
import net.dv8tion.jda.api.events.thread.GenericThreadEvent;
import net.dv8tion.jda.api.events.thread.ThreadHiddenEvent;
import net.dv8tion.jda.api.events.thread.ThreadRevealedEvent;
import net.dv8tion.jda.api.events.thread.member.GenericThreadMemberEvent;
import net.dv8tion.jda.api.events.thread.member.ThreadMemberJoinEvent;
import net.dv8tion.jda.api.events.thread.member.ThreadMemberLeaveEvent;
import net.dv8tion.jda.api.events.user.GenericUserEvent;
import net.dv8tion.jda.api.events.user.UserActivityEndEvent;
import net.dv8tion.jda.api.events.user.UserActivityStartEvent;
import net.dv8tion.jda.api.events.user.UserTypingEvent;
import net.dv8tion.jda.api.events.user.update.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

abstract class PreDiscordCommand extends ListenerAdapter {

    @Deprecated
    public final void onUserActivityStart(@NotNull UserActivityStartEvent event) {
        super.onUserActivityStart(event);
    }

    @Deprecated
    public final void onUserActivityEnd(@NotNull UserActivityEndEvent event) {
        super.onUserActivityEnd(event);
    }

    @Deprecated
    public final void onUserUpdateActivities(@NotNull UserUpdateActivitiesEvent event) {
        super.onUserUpdateActivities(event);
    }

    @Deprecated
    public final void onSelfUpdateAvatar(@NotNull SelfUpdateAvatarEvent event) {
        super.onSelfUpdateAvatar(event);
    }

    @Deprecated
    public final void onSelfUpdateMFA(@NotNull SelfUpdateMFAEvent event) {
        super.onSelfUpdateMFA(event);
    }

    @Deprecated
    public final void onSelfUpdateName(@NotNull SelfUpdateNameEvent event) {
        super.onSelfUpdateName(event);
    }

    @Deprecated
    public final void onSelfUpdateGlobalName(@NotNull SelfUpdateGlobalNameEvent event) {
        super.onSelfUpdateGlobalName(event);
    }

    @Deprecated
    public final void onSelfUpdateVerified(@NotNull SelfUpdateVerifiedEvent event) {
        super.onSelfUpdateVerified(event);
    }

    @Deprecated
    public final void onMessageReceived(@NotNull MessageReceivedEvent event) {
        super.onMessageReceived(event);
    }

    @Deprecated
    public final void onMessageUpdate(@NotNull MessageUpdateEvent event) {
        super.onMessageUpdate(event);
    }

    @Deprecated
    public final void onMessageDelete(@NotNull MessageDeleteEvent event) {
        super.onMessageDelete(event);
    }

    @Deprecated
    public final void onMessageBulkDelete(@NotNull MessageBulkDeleteEvent event) {
        super.onMessageBulkDelete(event);
    }

    @Deprecated
    public final void onMessageEmbed(@NotNull MessageEmbedEvent event) {
        super.onMessageEmbed(event);
    }

    @Deprecated
    public final void onMessageReactionAdd(@NotNull MessageReactionAddEvent event) {
        super.onMessageReactionAdd(event);
    }

    @Deprecated
    public final void onMessageReactionRemove(@NotNull MessageReactionRemoveEvent event) {
        super.onMessageReactionRemove(event);
    }

    @Deprecated
    public final void onMessageReactionRemoveAll(@NotNull MessageReactionRemoveAllEvent event) {
        super.onMessageReactionRemoveAll(event);
    }

    @Deprecated
    public final void onMessageReactionRemoveEmoji(@NotNull MessageReactionRemoveEmojiEvent event) {
        super.onMessageReactionRemoveEmoji(event);
    }

    @Deprecated
    public final void onPermissionOverrideDelete(@NotNull PermissionOverrideDeleteEvent event) {
        super.onPermissionOverrideDelete(event);
    }

    @Deprecated
    public final void onPermissionOverrideUpdate(@NotNull PermissionOverrideUpdateEvent event) {
        super.onPermissionOverrideUpdate(event);
    }

    @Deprecated
    public final void onPermissionOverrideCreate(@NotNull PermissionOverrideCreateEvent event) {
        super.onPermissionOverrideCreate(event);
    }

    @Deprecated
    public final void onStageInstanceDelete(@NotNull StageInstanceDeleteEvent event) {
        super.onStageInstanceDelete(event);
    }

    @Deprecated
    public final void onStageInstanceUpdateTopic(@NotNull StageInstanceUpdateTopicEvent event) {
        super.onStageInstanceUpdateTopic(event);
    }

    @Deprecated
    public final void onStageInstanceUpdatePrivacyLevel(@NotNull StageInstanceUpdatePrivacyLevelEvent event) {
        super.onStageInstanceUpdatePrivacyLevel(event);
    }

    @Deprecated
    public final void onStageInstanceCreate(@NotNull StageInstanceCreateEvent event) {
        super.onStageInstanceCreate(event);
    }

    @Deprecated
    public final void onChannelCreate(@NotNull ChannelCreateEvent event) {
        super.onChannelCreate(event);
    }

    @Deprecated
    public final void onChannelDelete(@NotNull ChannelDeleteEvent event) {
        super.onChannelDelete(event);
    }

    @Deprecated
    public final void onChannelUpdateBitrate(@NotNull ChannelUpdateBitrateEvent event) {
        super.onChannelUpdateBitrate(event);
    }

    @Deprecated
    public final void onChannelUpdateName(@NotNull ChannelUpdateNameEvent event) {
        super.onChannelUpdateName(event);
    }

    @Deprecated
    public final void onChannelUpdateFlags(@NotNull ChannelUpdateFlagsEvent event) {
        super.onChannelUpdateFlags(event);
    }

    @Deprecated
    public final void onChannelUpdateNSFW(@NotNull ChannelUpdateNSFWEvent event) {
        super.onChannelUpdateNSFW(event);
    }

    @Deprecated
    public final void onChannelUpdateParent(@NotNull ChannelUpdateParentEvent event) {
        super.onChannelUpdateParent(event);
    }

    @Deprecated
    public final void onChannelUpdatePosition(@NotNull ChannelUpdatePositionEvent event) {
        super.onChannelUpdatePosition(event);
    }

    @Deprecated
    public final void onChannelUpdateRegion(@NotNull ChannelUpdateRegionEvent event) {
        super.onChannelUpdateRegion(event);
    }

    @Deprecated
    public final void onChannelUpdateSlowmode(@NotNull ChannelUpdateSlowmodeEvent event) {
        super.onChannelUpdateSlowmode(event);
    }

    @Deprecated
    public final void onChannelUpdateDefaultThreadSlowmode(@NotNull ChannelUpdateDefaultThreadSlowmodeEvent event) {
        super.onChannelUpdateDefaultThreadSlowmode(event);
    }

    @Deprecated
    public final void onChannelUpdateDefaultReaction(@NotNull ChannelUpdateDefaultReactionEvent event) {
        super.onChannelUpdateDefaultReaction(event);
    }

    @Deprecated
    public final void onChannelUpdateDefaultSortOrder(@NotNull ChannelUpdateDefaultSortOrderEvent event) {
        super.onChannelUpdateDefaultSortOrder(event);
    }

    @Deprecated
    public final void onChannelUpdateDefaultLayout(@NotNull ChannelUpdateDefaultLayoutEvent event) {
        super.onChannelUpdateDefaultLayout(event);
    }

    @Deprecated
    public final void onChannelUpdateTopic(@NotNull ChannelUpdateTopicEvent event) {
        super.onChannelUpdateTopic(event);
    }

    @Deprecated
    public final void onChannelUpdateType(@NotNull ChannelUpdateTypeEvent event) {
        super.onChannelUpdateType(event);
    }

    @Deprecated
    public final void onChannelUpdateUserLimit(@NotNull ChannelUpdateUserLimitEvent event) {
        super.onChannelUpdateUserLimit(event);
    }

    @Deprecated
    public final void onChannelUpdateArchived(@NotNull ChannelUpdateArchivedEvent event) {
        super.onChannelUpdateArchived(event);
    }

    @Deprecated
    public final void onChannelUpdateArchiveTimestamp(@NotNull ChannelUpdateArchiveTimestampEvent event) {
        super.onChannelUpdateArchiveTimestamp(event);
    }

    @Deprecated
    public final void onChannelUpdateAutoArchiveDuration(@NotNull ChannelUpdateAutoArchiveDurationEvent event) {
        super.onChannelUpdateAutoArchiveDuration(event);
    }

    @Deprecated
    public final void onChannelUpdateLocked(@NotNull ChannelUpdateLockedEvent event) {
        super.onChannelUpdateLocked(event);
    }

    @Deprecated
    public final void onChannelUpdateInvitable(@NotNull ChannelUpdateInvitableEvent event) {
        super.onChannelUpdateInvitable(event);
    }

    @Deprecated
    public final void onChannelUpdateAppliedTags(@NotNull ChannelUpdateAppliedTagsEvent event) {
        super.onChannelUpdateAppliedTags(event);
    }

    @Deprecated
    public final void onForumTagAdd(@NotNull ForumTagAddEvent event) {
        super.onForumTagAdd(event);
    }

    @Deprecated
    public final void onForumTagRemove(@NotNull ForumTagRemoveEvent event) {
        super.onForumTagRemove(event);
    }

    @Deprecated
    public final void onForumTagUpdateName(@NotNull ForumTagUpdateNameEvent event) {
        super.onForumTagUpdateName(event);
    }

    @Deprecated
    public final void onForumTagUpdateEmoji(@NotNull ForumTagUpdateEmojiEvent event) {
        super.onForumTagUpdateEmoji(event);
    }

    @Deprecated
    public final void onForumTagUpdateModerated(@NotNull ForumTagUpdateModeratedEvent event) {
        super.onForumTagUpdateModerated(event);
    }

    @Deprecated
    public final void onThreadRevealed(@NotNull ThreadRevealedEvent event) {
        super.onThreadRevealed(event);
    }

    @Deprecated
    public final void onThreadHidden(@NotNull ThreadHiddenEvent event) {
        super.onThreadHidden(event);
    }

    @Deprecated
    public final void onThreadMemberJoin(@NotNull ThreadMemberJoinEvent event) {
        super.onThreadMemberJoin(event);
    }

    @Deprecated
    public final void onThreadMemberLeave(@NotNull ThreadMemberLeaveEvent event) {
        super.onThreadMemberLeave(event);
    }

    @Deprecated
    public final void onGuildReady(@NotNull GuildReadyEvent event) {
        super.onGuildReady(event);
    }

    @Deprecated
    public final void onGuildTimeout(@NotNull GuildTimeoutEvent event) {
        super.onGuildTimeout(event);
    }

    @Deprecated
    public final void onGuildJoin(@NotNull GuildJoinEvent event) {
        super.onGuildJoin(event);
    }

    @Deprecated
    public final void onGuildLeave(@NotNull GuildLeaveEvent event) {
        super.onGuildLeave(event);
    }

    @Deprecated
    public final void onGuildAvailable(@NotNull GuildAvailableEvent event) {
        super.onGuildAvailable(event);
    }

    @Deprecated
    public final void onGuildUnavailable(@NotNull GuildUnavailableEvent event) {
        super.onGuildUnavailable(event);
    }

    @Deprecated
    public final void onUnavailableGuildJoined(@NotNull UnavailableGuildJoinedEvent event) {
        super.onUnavailableGuildJoined(event);
    }

    @Deprecated
    public final void onUnavailableGuildLeave(@NotNull UnavailableGuildLeaveEvent event) {
        super.onUnavailableGuildLeave(event);
    }

    @Deprecated
    public final void onGuildBan(@NotNull GuildBanEvent event) {
        super.onGuildBan(event);
    }

    @Deprecated
    public final void onGuildUnban(@NotNull GuildUnbanEvent event) {
        super.onGuildUnban(event);
    }

    @Deprecated
    public final void onGuildAuditLogEntryCreate(@NotNull GuildAuditLogEntryCreateEvent event) {
        super.onGuildAuditLogEntryCreate(event);
    }

    @Deprecated
    public final void onGuildMemberRemove(@NotNull GuildMemberRemoveEvent event) {
        super.onGuildMemberRemove(event);
    }

    @Deprecated
    public final void onGuildUpdateAfkChannel(@NotNull GuildUpdateAfkChannelEvent event) {
        super.onGuildUpdateAfkChannel(event);
    }

    @Deprecated
    public final void onGuildUpdateSystemChannel(@NotNull GuildUpdateSystemChannelEvent event) {
        super.onGuildUpdateSystemChannel(event);
    }

    @Deprecated
    public final void onGuildUpdateRulesChannel(@NotNull GuildUpdateRulesChannelEvent event) {
        super.onGuildUpdateRulesChannel(event);
    }

    @Deprecated
    public final void onGuildUpdateCommunityUpdatesChannel(@NotNull GuildUpdateCommunityUpdatesChannelEvent event) {
        super.onGuildUpdateCommunityUpdatesChannel(event);
    }

    @Deprecated
    public final void onGuildUpdateAfkTimeout(@NotNull GuildUpdateAfkTimeoutEvent event) {
        super.onGuildUpdateAfkTimeout(event);
    }

    @Deprecated
    public final void onGuildUpdateExplicitContentLevel(@NotNull GuildUpdateExplicitContentLevelEvent event) {
        super.onGuildUpdateExplicitContentLevel(event);
    }

    @Deprecated
    public final void onGuildUpdateIcon(@NotNull GuildUpdateIconEvent event) {
        super.onGuildUpdateIcon(event);
    }

    @Deprecated
    public final void onGuildUpdateMFALevel(@NotNull GuildUpdateMFALevelEvent event) {
        super.onGuildUpdateMFALevel(event);
    }

    @Deprecated
    public final void onGuildUpdateName(@NotNull GuildUpdateNameEvent event) {
        super.onGuildUpdateName(event);
    }

    @Deprecated
    public final void onGuildUpdateNotificationLevel(@NotNull GuildUpdateNotificationLevelEvent event) {
        super.onGuildUpdateNotificationLevel(event);
    }

    @Deprecated
    public final void onGuildUpdateOwner(@NotNull GuildUpdateOwnerEvent event) {
        super.onGuildUpdateOwner(event);
    }

    @Deprecated
    public final void onGuildUpdateSplash(@NotNull GuildUpdateSplashEvent event) {
        super.onGuildUpdateSplash(event);
    }

    @Deprecated
    public final void onGuildUpdateVerificationLevel(@NotNull GuildUpdateVerificationLevelEvent event) {
        super.onGuildUpdateVerificationLevel(event);
    }

    @Deprecated
    public final void onGuildUpdateLocale(@NotNull GuildUpdateLocaleEvent event) {
        super.onGuildUpdateLocale(event);
    }

    @Deprecated
    public final void onGuildUpdateFeatures(@NotNull GuildUpdateFeaturesEvent event) {
        super.onGuildUpdateFeatures(event);
    }

    @Deprecated
    public final void onGuildUpdateVanityCode(@NotNull GuildUpdateVanityCodeEvent event) {
        super.onGuildUpdateVanityCode(event);
    }

    @Deprecated
    public final void onGuildUpdateBanner(@NotNull GuildUpdateBannerEvent event) {
        super.onGuildUpdateBanner(event);
    }

    @Deprecated
    public final void onGuildUpdateDescription(@NotNull GuildUpdateDescriptionEvent event) {
        super.onGuildUpdateDescription(event);
    }

    @Deprecated
    public final void onGuildUpdateBoostTier(@NotNull GuildUpdateBoostTierEvent event) {
        super.onGuildUpdateBoostTier(event);
    }

    @Deprecated
    public final void onGuildUpdateBoostCount(@NotNull GuildUpdateBoostCountEvent event) {
        super.onGuildUpdateBoostCount(event);
    }

    @Deprecated
    public final void onGuildUpdateMaxMembers(@NotNull GuildUpdateMaxMembersEvent event) {
        super.onGuildUpdateMaxMembers(event);
    }

    @Deprecated
    public final void onGuildUpdateMaxPresences(@NotNull GuildUpdateMaxPresencesEvent event) {
        super.onGuildUpdateMaxPresences(event);
    }

    @Deprecated
    public final void onGuildUpdateNSFWLevel(@NotNull GuildUpdateNSFWLevelEvent event) {
        super.onGuildUpdateNSFWLevel(event);
    }

    @Deprecated
    public final void onScheduledEventUpdateDescription(@NotNull ScheduledEventUpdateDescriptionEvent event) {
        super.onScheduledEventUpdateDescription(event);
    }

    @Deprecated
    public final void onScheduledEventUpdateEndTime(@NotNull ScheduledEventUpdateEndTimeEvent event) {
        super.onScheduledEventUpdateEndTime(event);
    }

    @Deprecated
    public final void onScheduledEventUpdateLocation(@NotNull ScheduledEventUpdateLocationEvent event) {
        super.onScheduledEventUpdateLocation(event);
    }

    @Deprecated
    public final void onScheduledEventUpdateName(@NotNull ScheduledEventUpdateNameEvent event) {
        super.onScheduledEventUpdateName(event);
    }

    @Deprecated
    public final void onScheduledEventUpdateStartTime(@NotNull ScheduledEventUpdateStartTimeEvent event) {
        super.onScheduledEventUpdateStartTime(event);
    }

    @Deprecated
    public final void onScheduledEventUpdateStatus(@NotNull ScheduledEventUpdateStatusEvent event) {
        super.onScheduledEventUpdateStatus(event);
    }

    @Deprecated
    public final void onScheduledEventUpdateImage(@NotNull ScheduledEventUpdateImageEvent event) {
        super.onScheduledEventUpdateImage(event);
    }

    @Deprecated
    public final void onScheduledEventCreate(@NotNull ScheduledEventCreateEvent event) {
        super.onScheduledEventCreate(event);
    }

    @Deprecated
    public final void onScheduledEventDelete(@NotNull ScheduledEventDeleteEvent event) {
        super.onScheduledEventDelete(event);
    }

    @Deprecated
    public final void onScheduledEventUserAdd(@NotNull ScheduledEventUserAddEvent event) {
        super.onScheduledEventUserAdd(event);
    }

    @Deprecated
    public final void onScheduledEventUserRemove(@NotNull ScheduledEventUserRemoveEvent event) {
        super.onScheduledEventUserRemove(event);
    }

    @Deprecated
    public final void onGuildInviteCreate(@NotNull GuildInviteCreateEvent event) {
        super.onGuildInviteCreate(event);
    }

    @Deprecated
    public final void onGuildInviteDelete(@NotNull GuildInviteDeleteEvent event) {
        super.onGuildInviteDelete(event);
    }

    @Deprecated
    public final void onGuildMemberJoin(@NotNull GuildMemberJoinEvent event) {
        super.onGuildMemberJoin(event);
    }

    @Deprecated
    public final void onGuildMemberRoleAdd(@NotNull GuildMemberRoleAddEvent event) {
        super.onGuildMemberRoleAdd(event);
    }

    @Deprecated
    public final void onGuildMemberRoleRemove(@NotNull GuildMemberRoleRemoveEvent event) {
        super.onGuildMemberRoleRemove(event);
    }

    @Deprecated
    public final void onGuildMemberUpdate(@NotNull GuildMemberUpdateEvent event) {
        super.onGuildMemberUpdate(event);
    }

    @Deprecated
    public final void onGuildMemberUpdateNickname(@NotNull GuildMemberUpdateNicknameEvent event) {
        super.onGuildMemberUpdateNickname(event);
    }

    @Deprecated
    public final void onGuildMemberUpdateAvatar(@NotNull GuildMemberUpdateAvatarEvent event) {
        super.onGuildMemberUpdateAvatar(event);
    }

    @Deprecated
    public final void onGuildMemberUpdateBoostTime(@NotNull GuildMemberUpdateBoostTimeEvent event) {
        super.onGuildMemberUpdateBoostTime(event);
    }

    @Deprecated
    public final void onGuildMemberUpdatePending(@NotNull GuildMemberUpdatePendingEvent event) {
        super.onGuildMemberUpdatePending(event);
    }

    @Deprecated
    public final void onGuildMemberUpdateFlags(@NotNull GuildMemberUpdateFlagsEvent event) {
        super.onGuildMemberUpdateFlags(event);
    }

    @Deprecated
    public final void onGuildMemberUpdateTimeOut(@NotNull GuildMemberUpdateTimeOutEvent event) {
        super.onGuildMemberUpdateTimeOut(event);
    }

    @Deprecated
    public final void onGuildVoiceUpdate(@NotNull GuildVoiceUpdateEvent event) {
        super.onGuildVoiceUpdate(event);
    }

    @Deprecated
    public final void onGuildVoiceMute(@NotNull GuildVoiceMuteEvent event) {
        super.onGuildVoiceMute(event);
    }

    @Deprecated
    public final void onGuildVoiceDeafen(@NotNull GuildVoiceDeafenEvent event) {
        super.onGuildVoiceDeafen(event);
    }

    @Deprecated
    public final void onGuildVoiceGuildMute(@NotNull GuildVoiceGuildMuteEvent event) {
        super.onGuildVoiceGuildMute(event);
    }

    @Deprecated
    public final void onGuildVoiceGuildDeafen(@NotNull GuildVoiceGuildDeafenEvent event) {
        super.onGuildVoiceGuildDeafen(event);
    }

    @Deprecated
    public final void onGuildVoiceSelfMute(@NotNull GuildVoiceSelfMuteEvent event) {
        super.onGuildVoiceSelfMute(event);
    }

    @Deprecated
    public final void onGuildVoiceSelfDeafen(@NotNull GuildVoiceSelfDeafenEvent event) {
        super.onGuildVoiceSelfDeafen(event);
    }

    @Deprecated
    public final void onGuildVoiceSuppress(@NotNull GuildVoiceSuppressEvent event) {
        super.onGuildVoiceSuppress(event);
    }

    @Deprecated
    public final void onGuildVoiceStream(@NotNull GuildVoiceStreamEvent event) {
        super.onGuildVoiceStream(event);
    }

    @Deprecated
    public final void onGuildVoiceVideo(@NotNull GuildVoiceVideoEvent event) {
        super.onGuildVoiceVideo(event);
    }

    @Deprecated
    public final void onGuildVoiceRequestToSpeak(@NotNull GuildVoiceRequestToSpeakEvent event) {
        super.onGuildVoiceRequestToSpeak(event);
    }

    @Deprecated
    public final void onAutoModExecution(@NotNull AutoModExecutionEvent event) {
        super.onAutoModExecution(event);
    }

    @Deprecated
    public final void onAutoModRuleCreate(@NotNull AutoModRuleCreateEvent event) {
        super.onAutoModRuleCreate(event);
    }

    @Deprecated
    public final void onAutoModRuleUpdate(@NotNull AutoModRuleUpdateEvent event) {
        super.onAutoModRuleUpdate(event);
    }

    @Deprecated
    public final void onAutoModRuleDelete(@NotNull AutoModRuleDeleteEvent event) {
        super.onAutoModRuleDelete(event);
    }

    @Deprecated
    public final void onRoleCreate(@NotNull RoleCreateEvent event) {
        super.onRoleCreate(event);
    }

    @Deprecated
    public final void onRoleDelete(@NotNull RoleDeleteEvent event) {
        super.onRoleDelete(event);
    }

    @Deprecated
    public final void onRoleUpdateColor(@NotNull RoleUpdateColorEvent event) {
        super.onRoleUpdateColor(event);
    }

    @Deprecated
    public final void onRoleUpdateHoisted(@NotNull RoleUpdateHoistedEvent event) {
        super.onRoleUpdateHoisted(event);
    }

    @Deprecated
    public final void onRoleUpdateIcon(@NotNull RoleUpdateIconEvent event) {
        super.onRoleUpdateIcon(event);
    }

    @Deprecated
    public final void onRoleUpdateMentionable(@NotNull RoleUpdateMentionableEvent event) {
        super.onRoleUpdateMentionable(event);
    }

    @Deprecated
    public final void onRoleUpdateName(@NotNull RoleUpdateNameEvent event) {
        super.onRoleUpdateName(event);
    }

    @Deprecated
    public final void onRoleUpdatePermissions(@NotNull RoleUpdatePermissionsEvent event) {
        super.onRoleUpdatePermissions(event);
    }

    @Deprecated
    public final void onRoleUpdatePosition(@NotNull RoleUpdatePositionEvent event) {
        super.onRoleUpdatePosition(event);
    }

    @Deprecated
    public final void onEmojiAdded(@NotNull EmojiAddedEvent event) {
        super.onEmojiAdded(event);
    }

    @Deprecated
    public final void onEmojiRemoved(@NotNull EmojiRemovedEvent event) {
        super.onEmojiRemoved(event);
    }

    @Deprecated
    public final void onEmojiUpdateName(@NotNull EmojiUpdateNameEvent event) {
        super.onEmojiUpdateName(event);
    }

    @Deprecated
    public final void onEmojiUpdateRoles(@NotNull EmojiUpdateRolesEvent event) {
        super.onEmojiUpdateRoles(event);
    }

    @Deprecated
    public final void onGenericPrivilegeUpdate(@NotNull GenericPrivilegeUpdateEvent event) {
        super.onGenericPrivilegeUpdate(event);
    }

    @Deprecated
    public final void onApplicationCommandUpdatePrivileges(@NotNull ApplicationCommandUpdatePrivilegesEvent event) {
        super.onApplicationCommandUpdatePrivileges(event);
    }

    @Deprecated
    public final void onApplicationUpdatePrivileges(@NotNull ApplicationUpdatePrivilegesEvent event) {
        super.onApplicationUpdatePrivileges(event);
    }

    @Deprecated
    public final void onGuildStickerAdded(@NotNull GuildStickerAddedEvent event) {
        super.onGuildStickerAdded(event);
    }

    @Deprecated
    public final void onGuildStickerRemoved(@NotNull GuildStickerRemovedEvent event) {
        super.onGuildStickerRemoved(event);
    }

    @Deprecated
    public final void onGuildStickerUpdateName(@NotNull GuildStickerUpdateNameEvent event) {
        super.onGuildStickerUpdateName(event);
    }

    @Deprecated
    public final void onGuildStickerUpdateTags(@NotNull GuildStickerUpdateTagsEvent event) {
        super.onGuildStickerUpdateTags(event);
    }

    @Deprecated
    public final void onGuildStickerUpdateDescription(@NotNull GuildStickerUpdateDescriptionEvent event) {
        super.onGuildStickerUpdateDescription(event);
    }

    @Deprecated
    public final void onGuildStickerUpdateAvailable(@NotNull GuildStickerUpdateAvailableEvent event) {
        super.onGuildStickerUpdateAvailable(event);
    }

    @Deprecated
    public final void onHttpRequest(@NotNull HttpRequestEvent event) {
        super.onHttpRequest(event);
    }

    @SuppressWarnings("deprecation")
    @Deprecated
    public final void onGenericSessionEvent(@NotNull GenericSessionEvent event) {
        super.onGenericSessionEvent(event);
    }

    @Deprecated
    public final void onGenericSession(@NotNull GenericSessionEvent event) {
        super.onGenericSession(event);
    }

    @Deprecated
    public final void onGenericInteractionCreate(@NotNull GenericInteractionCreateEvent event) {
        super.onGenericInteractionCreate(event);
    }

    @Deprecated
    public final void onGenericAutoCompleteInteraction(@NotNull GenericAutoCompleteInteractionEvent event) {
        super.onGenericAutoCompleteInteraction(event);
    }

    @Deprecated
    public final void onGenericComponentInteractionCreate(@NotNull GenericComponentInteractionCreateEvent event) {
        super.onGenericComponentInteractionCreate(event);
    }

    @Deprecated
    public final void onGenericCommandInteraction(@NotNull GenericCommandInteractionEvent event) {
        super.onGenericCommandInteraction(event);
    }

    @Deprecated
    public final void onGenericContextInteraction(@NotNull GenericContextInteractionEvent<?> event) {
        super.onGenericContextInteraction(event);
    }

    @Deprecated
    public final void onGenericSelectMenuInteraction(@NotNull GenericSelectMenuInteractionEvent event) {
        super.onGenericSelectMenuInteraction(event);
    }

    @Deprecated
    public final void onGenericMessage(@NotNull GenericMessageEvent event) {
        super.onGenericMessage(event);
    }

    @Deprecated
    public final void onGenericMessageReaction(@NotNull GenericMessageReactionEvent event) {
        super.onGenericMessageReaction(event);
    }

    @Deprecated
    public final void onGenericUser(@NotNull GenericUserEvent event) {
        super.onGenericUser(event);
    }

    @Deprecated
    public final void onGenericUserPresence(@NotNull GenericUserPresenceEvent event) {
        super.onGenericUserPresence(event);
    }

    @Deprecated
    public final void onGenericUserUpdate(@NotNull GenericUserUpdateEvent event) {
        super.onGenericUserUpdate(event);
    }

    @Deprecated
    public final void onGenericSelfUpdate(@NotNull GenericSelfUpdateEvent event) {
        super.onGenericSelfUpdate(event);
    }

    @Deprecated
    public final void onGenericStageInstance(@NotNull GenericStageInstanceEvent event) {
        super.onGenericStageInstance(event);
    }

    @Deprecated
    public final void onGenericStageInstanceUpdate(@NotNull GenericStageInstanceUpdateEvent event) {
        super.onGenericStageInstanceUpdate(event);
    }

    @Deprecated
    public final void onGenericChannel(@NotNull GenericChannelEvent event) {
        super.onGenericChannel(event);
    }

    @Deprecated
    public final void onGenericChannelUpdate(@NotNull GenericChannelUpdateEvent<?> event) {
        super.onGenericChannelUpdate(event);
    }

    @Deprecated
    public final void onGenericThread(@NotNull GenericThreadEvent event) {
        super.onGenericThread(event);
    }

    @Deprecated
    public final void onGenericThreadMember(@NotNull GenericThreadMemberEvent event) {
        super.onGenericThreadMember(event);
    }

    @Deprecated
    public final void onGenericGuild(@NotNull GenericGuildEvent event) {
        super.onGenericGuild(event);
    }

    @Deprecated
    public final void onGenericGuildUpdate(@NotNull GenericGuildUpdateEvent event) {
        super.onGenericGuildUpdate(event);
    }

    @Deprecated
    public final void onGenericGuildInvite(@NotNull GenericGuildInviteEvent event) {
        super.onGenericGuildInvite(event);
    }

    @Deprecated
    public final void onGenericGuildMember(@NotNull GenericGuildMemberEvent event) {
        super.onGenericGuildMember(event);
    }

    @Deprecated
    public final void onGenericGuildMemberUpdate(@NotNull GenericGuildMemberUpdateEvent event) {
        super.onGenericGuildMemberUpdate(event);
    }

    @Deprecated
    public final void onGenericGuildVoice(@NotNull GenericGuildVoiceEvent event) {
        super.onGenericGuildVoice(event);
    }

    @Deprecated
    public final void onGenericAutoModRule(@NotNull GenericAutoModRuleEvent event) {
        super.onGenericAutoModRule(event);
    }

    @Deprecated
    public final void onGenericRole(@NotNull GenericRoleEvent event) {
        super.onGenericRole(event);
    }

    @Deprecated
    public final void onGenericRoleUpdate(@NotNull GenericRoleUpdateEvent event) {
        super.onGenericRoleUpdate(event);
    }

    @Deprecated
    public final void onGenericEmoji(@NotNull GenericEmojiEvent event) {
        super.onGenericEmoji(event);
    }

    @Deprecated
    public final void onGenericEmojiUpdate(@NotNull GenericEmojiUpdateEvent event) {
        super.onGenericEmojiUpdate(event);
    }

    @Deprecated
    public final void onGenericGuildSticker(@NotNull GenericGuildStickerEvent event) {
        super.onGenericGuildSticker(event);
    }

    @Deprecated
    public final void onGenericGuildStickerUpdate(@NotNull GenericGuildStickerUpdateEvent event) {
        super.onGenericGuildStickerUpdate(event);
    }

    @Deprecated
    public final void onGenericPermissionOverride(@NotNull GenericPermissionOverrideEvent event) {
        super.onGenericPermissionOverride(event);
    }

    @Deprecated
    public final void onGenericScheduledEventUpdate(@NotNull GenericScheduledEventUpdateEvent event) {
        super.onGenericScheduledEventUpdate(event);
    }

    @Deprecated
    public final void onGenericScheduledEventGateway(@NotNull GenericScheduledEventGatewayEvent event) {
        super.onGenericScheduledEventGateway(event);
    }

    @Deprecated
    public final void onGenericScheduledEventUser(@NotNull GenericScheduledEventUserEvent event) {
        super.onGenericScheduledEventUser(event);
    }

    @Deprecated
    public final void onGenericForumTag(@NotNull GenericForumTagEvent event) {
        super.onGenericForumTag(event);
    }

    @Deprecated
    public final void onGenericForumTagUpdate(@NotNull GenericForumTagUpdateEvent event) {
        super.onGenericForumTagUpdate(event);
    }

    @Deprecated
    public final void onGenericEvent(@NotNull GenericEvent event) {
        super.onGenericEvent(event);
    }

    @Deprecated
    public final void onGenericUpdate(@NotNull UpdateEvent<?, ?> event) {
        super.onGenericUpdate(event);
    }

    @Deprecated
    public final void onRawGateway(@NotNull RawGatewayEvent event) {
        super.onRawGateway(event);
    }

    @Deprecated
    public final void onGatewayPing(@NotNull GatewayPingEvent event) {
        super.onGatewayPing(event);
    }

    @Deprecated
    public final void onReady(@NotNull ReadyEvent event) {
        super.onReady(event);
    }

    @Deprecated
    public final void onSessionInvalidate(@NotNull SessionInvalidateEvent event) {
        super.onSessionInvalidate(event);
    }

    @Deprecated
    public final void onSessionDisconnect(@NotNull SessionDisconnectEvent event) {
        super.onSessionDisconnect(event);
    }

    @Deprecated
    public final void onSessionResume(@NotNull SessionResumeEvent event) {
        super.onSessionResume(event);
    }

    @Deprecated
    public final void onSessionRecreate(@NotNull SessionRecreateEvent event) {
        super.onSessionRecreate(event);
    }

    @Deprecated
    public final void onShutdown(@NotNull ShutdownEvent event) {
        super.onShutdown(event);
    }

    @Deprecated
    public final void onStatusChange(@NotNull StatusChangeEvent event) {
        super.onStatusChange(event);
    }

    @Deprecated
    public final void onException(@NotNull ExceptionEvent event) {
        super.onException(event);
    }

    @Deprecated
    public final void onUserContextInteraction(@NotNull UserContextInteractionEvent event) {
        super.onUserContextInteraction(event);
    }

    @Deprecated
    public final void onMessageContextInteraction(@NotNull MessageContextInteractionEvent event) {
        super.onMessageContextInteraction(event);
    }

    @Deprecated
    public final void onButtonInteraction(@NotNull ButtonInteractionEvent event) {
        super.onButtonInteraction(event);
    }

    @Deprecated
    public final void onCommandAutoCompleteInteraction(@NotNull CommandAutoCompleteInteractionEvent event) {
        super.onCommandAutoCompleteInteraction(event);
    }

    @Deprecated
    public final void onModalInteraction(@NotNull ModalInteractionEvent event) {
        super.onModalInteraction(event);
    }

    @Deprecated
    public final void onStringSelectInteraction(@NotNull StringSelectInteractionEvent event) {
        super.onStringSelectInteraction(event);
    }

    @Deprecated
    public final void onEntitySelectInteraction(@NotNull EntitySelectInteractionEvent event) {
        super.onEntitySelectInteraction(event);
    }

    @Deprecated
    public final void onUserUpdateName(@NotNull UserUpdateNameEvent event) {
        super.onUserUpdateName(event);
    }

    @Deprecated
    public final void onUserUpdateGlobalName(@NotNull UserUpdateGlobalNameEvent event) {
        super.onUserUpdateGlobalName(event);
    }

    @SuppressWarnings("deprecation")
    @Deprecated
    public final void onUserUpdateDiscriminator(@NotNull UserUpdateDiscriminatorEvent event) {
        super.onUserUpdateDiscriminator(event);
    }

    @Deprecated
    public final void onUserUpdateAvatar(@NotNull UserUpdateAvatarEvent event) {
        super.onUserUpdateAvatar(event);
    }

    @Deprecated
    public final void onUserUpdateOnlineStatus(@NotNull UserUpdateOnlineStatusEvent event) {
        super.onUserUpdateOnlineStatus(event);
    }

    @Deprecated
    public final void onUserUpdateActivityOrder(@NotNull UserUpdateActivityOrderEvent event) {
        super.onUserUpdateActivityOrder(event);
    }

    @Deprecated
    public final void onUserUpdateFlags(@NotNull UserUpdateFlagsEvent event) {
        super.onUserUpdateFlags(event);
    }

    @Deprecated
    public final void onUserTyping(@NotNull UserTypingEvent event) {
        super.onUserTyping(event);
    }
}
